package lab2;

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
    public void totalSalary() throws Exception {
        List<Employee> employees = Arrays.asList(
                new Employee("Moshe", 10),
                new Employee("Jeka", 20),
                new Employee("Klara", 30)

        );


        int totalSalary = EmployeeUtil.totalSalary(employees);
        Assert.assertEquals(60,totalSalary);


    }

}