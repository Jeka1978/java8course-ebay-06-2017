package lab3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 09/07/2017.
 */
public interface EmployeeUtil {

    static List<String> namesSortedBySalary(List<lab2.Employee> employees) {
        return null;
    }

    static int totalSalaries(List<Employee> employees) {
       return employees.stream().flatMapToInt(employee -> Arrays.stream(employee.getSalaries())).sum();

    }
    static void printSortedEmployeesSortedByLengthOfTheName(List<Employee> employees) {
        Stream<Employee> sorted = employees.stream().filter(employee -> employee.getName().toUpperCase().equals(employee.getName()))
                .sorted((e1, e2) -> e2.getName().length() - e1.getName().length());

        sorted.forEach(System.out::println);

    }


    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("moshe", null), new Employee("BENI", null), new Employee("AVITAL", null));
        printSortedEmployeesSortedByLengthOfTheName(employees);
    }
}
