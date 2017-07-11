package stream_without_if;

import lombok.AllArgsConstructor;

/**
 * Created by Evegeny on 11/07/2017.
 */
@AllArgsConstructor
public enum Seniority {
    JUNIOR(0, 14000),
    MIDDLE(14001, 21000),
    SENIOR(21000, Integer.MAX_VALUE);

    private int min;
    private int max;
}
