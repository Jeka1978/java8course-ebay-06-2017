package collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static collectors.Gender.FEMALE;
import static collectors.Gender.MALE;

/**
 * Created by Evegeny on 11/07/2017.
 */
public interface EmpUtil {
    static boolean isManEmployeesMoreExpensive(List<Employee> employees) {
        Map<Boolean, List<Employee>> map = employees.stream().collect(
                Collectors.partitioningBy(emp -> emp.getGender() == MALE));
        Map<Boolean, Integer> gender2TotalSalary = map.entrySet().stream().collect(

                Collectors.toMap(Map.Entry::getKey, entry ->
                        entry.getValue().stream().mapToInt(Employee::getSalary).sum()));

        return gender2TotalSalary.get(true) > gender2TotalSalary.get(false);
    }
}






