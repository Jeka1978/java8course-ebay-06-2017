package collectors;

import lab2.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Evegeny on 11/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new lab2.Employee("Beni", 30),
                new lab2.Employee("Liran", 25),
                new lab2.Employee("Liran", 50));

        Map<String, Integer> map = employees.stream().collect(
                Collectors.toMap(Employee::getName, Employee::getSalary,
                        (oldSalary, newSalary) -> oldSalary + newSalary));
        System.out.println("map = " + map);
    }
}
