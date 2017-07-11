package date_and_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 11/07/2017.
 */
public class BlackFridayService {
    public static void printBlackFridaysQuantity(int startYear, int endYear) {

        LocalDate startDate = LocalDate.of(startYear, 1, 13);
        LocalDate endYearDate = LocalDate.of(endYear, 12, 13);
        Stream<LocalDate> dateStream = Stream.iterate(startDate, date -> date.plusMonths(1)).
                limit(ChronoUnit.MONTHS.between(startDate, endYearDate) + 1);
        Map<Integer, Long> map = dateStream.filter(date -> date.getDayOfWeek() == DayOfWeek.FRIDAY).peek(System.out::println)
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()));
        System.out.println(map);
        map.entrySet().stream().
                sorted((entry1, entry2) -> (int)(entry2.getValue()-entry1.getValue())).forEach(System.out::println);

//        map.entrySet().stream().sorted((e1,e2)->(int)Map.Entry.comparingByValue().reversed()).forEach(System.out::println);

        Comparator<Object> reversed = Comparator.comparingLong(null).reversed();

    }

    public static void main(String[] args) {
        printBlackFridaysQuantity(1980,2000);
    }


}
