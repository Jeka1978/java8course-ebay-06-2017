package lab3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 09/07/2017.
 */
public class EmployeeUtilTest {
    @Test
    public void namesSortedBySalary() throws Exception {
        List<lab2.Employee> employees = Arrays.asList(new lab2.Employee("Beni", 30), new lab2.Employee("Liran", 25),
                new lab2.Employee("Liraz", 50));
        List<String> names = EmployeeUtil.namesSortedBySalary(employees);
        Assert.assertEquals("Liraz",names.get(0));
        Assert.assertEquals("Beni",names.get(1));
        Assert.assertEquals("Liran",names.get(2));
    }

    @Test
    public void totalSalaries() throws Exception {

        int[] salaries1 = {1,2,3};
        int[] salaries2 = {10,20,30};

        List<Employee> employees = Arrays.asList(new Employee("jeka", salaries1), new Employee("Anna", salaries2));
        int totalSalaries = EmployeeUtil.totalSalaries(employees);
        Assert.assertEquals(66, totalSalaries);

    }

}