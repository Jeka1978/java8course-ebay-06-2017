package lab3;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 09/07/2017.
 */
public interface EmployeeUtil {
    static int totalSalaries(List<Employee> employees) {
       return employees.stream().flatMapToInt(employee -> Arrays.stream(employee.getSalaries())).sum();

    }
}
