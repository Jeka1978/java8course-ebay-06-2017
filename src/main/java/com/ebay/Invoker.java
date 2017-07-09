package com.ebay;

/**
 * Created by Evegeny on 09/07/2017.
 */
@FunctionalInterface
public interface Invoker<T> {
    void invoke(T t);

}
