package lab3;

import lombok.*;

/**
 * Created by Evegeny on 09/07/2017.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String name;
    private int[] salaries = new int[12];
}
