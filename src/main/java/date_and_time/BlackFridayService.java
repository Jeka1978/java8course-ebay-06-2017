package date_and_time;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 11/07/2017.
 */
public class BlackFridayService {
    public void printBlackFridaysQuantity(int startYear, int endYear) {
        Stream<Integer> stream = Stream.iterate(startYear, i -> i + 1).limit(endYear-startYear);
//        IntStream.range(startYear,endYear)
    }
}
