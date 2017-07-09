package multiple_inheritance;

/**
 * Created by Evegeny on 09/07/2017.
 */
public interface Father {
    default void talk() {
        System.out.println("Son, come home");
    }
}
