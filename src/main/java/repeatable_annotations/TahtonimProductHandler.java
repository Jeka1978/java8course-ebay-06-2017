package repeatable_annotations;

import lombok.NoArgsConstructor;

/**
 * Created by Evegeny on 11/07/2017.
 */
@ProductCode(1)
public class TahtonimProductHandler implements ProductHandler {
    @Override
    public void handle(Product product) {
        System.out.println("tahtonim were handled");
    }
}
