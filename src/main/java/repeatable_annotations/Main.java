package repeatable_annotations;

/**
 * Created by Evegeny on 11/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        ProductMainHandler mainHandler = new ProductMainHandler();
        Product product = Product.builder().id(2).price(100).build();
        mainHandler.handle(product);
    }
}
