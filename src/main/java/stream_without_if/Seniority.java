package stream_without_if;

import lombok.AllArgsConstructor;

import java.util.Arrays;

/**
 * Created by Evegeny on 11/07/2017.
 */
@AllArgsConstructor
public enum Seniority {
    JUNIOR(0, 14000),
    MIDDLE(14001, 21000),
    SENIOR(21001, Integer.MAX_VALUE);

    private int min;
    private int max;


    public static Seniority bySalary(int salary) {
        return Arrays.stream(values()).
                filter(seniority -> seniority.min <= salary && salary <= seniority.max)
                .findAny().orElseThrow(() -> new IllegalStateException(salary+" not match to any Seniority"));
    }




















}
