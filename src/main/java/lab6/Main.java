package lab6;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 09/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("masha", "moshe", "kuku");
        Optional<String> optional = stream.reduce((s1, s2) -> s1 + "," + s2);
        System.out.println(optional.get());
    }
}
