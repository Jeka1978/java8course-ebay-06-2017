package lab2;

import java.util.List;
import java.util.Optional;

/**
 * Created by Evegeny on 09/07/2017.
 */
public class EmployeeUtil {

    public static int totalSalary(List<Employee> employees) {
        /*Optional<Integer> optional = employees.stream().map(Employee::getSalary).reduce((a, b) -> a + b);
        return optional.orElse(0);*/

       return employees.stream().mapToInt(Employee::getSalary).sum();

    }
}
