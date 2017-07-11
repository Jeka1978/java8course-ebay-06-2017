package collectors.more_labs;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Evegeny on 11/07/2017.
 */
public interface EmployeeUtils {
    static Map<String, List<Employee>> getEmployeesByCompany(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getCompanyName));
    }

    static Map<String, Long> getNumberOfEmployeesPerCompany(List<Employee> employees) {
        return employees.stream().collect(
                Collectors.groupingBy(Employee::getCompanyName,Collectors.counting()));
    }



}
