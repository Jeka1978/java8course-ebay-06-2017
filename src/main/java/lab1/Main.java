package lab1;

import com.ebay.Invoker;
import com.ebay.ListUtil;
import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 09/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Scala", "java", "groovy");
        ListUtil.forEachWithDelay(strings, 1500, s -> System.out.println(s));
    }
}
