package multiple_inheritance;

/**
 * Created by Evegeny on 09/07/2017.
 */
public interface Mother {
    default void talk() {
        System.out.println("SON, COME HOME!!!");
    }
}
