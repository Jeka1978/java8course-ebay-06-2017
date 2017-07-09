package com.ebay;

import lombok.SneakyThrows;

import java.util.List;

/**
 * Created by Evegeny on 09/07/2017.
 */
public interface ListUtil {



    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Invoker<T> invoker) {
        for (T t : list) {
            invoker.invoke(t);
            Thread.sleep(delay);
        }
    }








    public static <T> int countDuplicates(List<T> list, T t,Equalator<T> equalator) {
        int counter = 0;
        for (T t1 : list) {
            if (equalator.equals(t1, t)) {

                counter++;
            }
        }
        return counter;
    }
}
