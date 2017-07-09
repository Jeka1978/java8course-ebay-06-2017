package lab2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Evegeny on 09/07/2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String name;
    private int salary;
}
