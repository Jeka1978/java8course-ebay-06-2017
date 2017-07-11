package repeatable_annotations;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Evegeny on 11/07/2017.
 */
public class ProductMainHandler {
    private Map<Integer, ProductHandler> map = new HashMap<>();

    @SneakyThrows
    public ProductMainHandler() {
        Reflections scanner = new Reflections("repeatable_annotations");
        Set<Class<? extends ProductHandler>> classes = scanner.getSubTypesOf(ProductHandler.class);
        for (Class<? extends ProductHandler> productHandlerClass : classes) {
            if (!Modifier.isAbstract(productHandlerClass.getModifiers())) {
                ProductCode annotation = productHandlerClass.getAnnotation(ProductCode.class);
                if (annotation == null) {
                    throw new IllegalStateException(productHandlerClass + " should have @" + ProductCode.class);
                }
                int value = annotation.value();
                if (map.containsKey(value)) {
                    throw new IllegalStateException(value + " already exists");
                }
                map.put(value, productHandlerClass.newInstance());
            }
        }

    }

    public void handle(Product product) {
        ProductHandler productHandler = map.get(product.getId());
        if (productHandler == null) {
            throw new UnsupportedOperationException(product.getId() + " not supported");
        }
        productHandler.handle(product);
    }

}
