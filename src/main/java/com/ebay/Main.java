package com.ebay;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 09/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java","Java","JAVA", "scala", "groovy");

        int duplicates = ListUtil.countDuplicates(strings, "java", (t1, s) -> t1.equalsIgnoreCase(s));
        System.out.println("duplicates = " + duplicates);


    }
}
