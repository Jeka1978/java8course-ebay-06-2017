package repeatable_annotations;

/**
 * Created by Evegeny on 11/07/2017.
 */
@ProductCode(2)
@ProductCode(13)
public class HultzotProductHandler implements ProductHandler {
    @Override
    public void handle(Product product) {
        System.out.println("hultzot were handled");
    }
}
