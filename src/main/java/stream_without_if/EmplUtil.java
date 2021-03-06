package stream_without_if;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Evegeny on 11/07/2017.
 */
public interface EmplUtil {
    static Map<Seniority, List<Employee>> mapEmployeesToSeniority(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(emp -> Seniority.bySalary(emp.getSalary())));
    }
}
