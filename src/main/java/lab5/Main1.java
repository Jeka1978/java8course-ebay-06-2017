package lab5;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 09/07/2017.
 */
public class Main1 {
    @SneakyThrows
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new FileReader("data/yesterday.txt"));
        Stream<String> lines = reader.lines();

        Stream<String> words = lines.map(String::toLowerCase)
                .flatMap(line -> Arrays.stream(line.split(" ")));


        List<String> wordsList = words.collect(Collectors.toList());

        long count = wordsList.stream().count();
        System.out.println("count = " + count);


        OptionalDouble average = wordsList.stream().mapToDouble(String::length).average();
        System.out.println("average = " + average.getAsDouble());



        reader.close();
    }
}


















