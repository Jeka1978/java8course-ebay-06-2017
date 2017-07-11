package collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Evegeny on 11/07/2017.
 */
@Data
@AllArgsConstructor
public class Employee {
    private int salary;
    private Gender gender;
}
