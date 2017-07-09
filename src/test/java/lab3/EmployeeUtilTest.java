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
    public void totalSalaries() throws Exception {

        int[] salaries1 = {1,2,3};
        int[] salaries2 = {10,20,30};

        List<Employee> employees = Arrays.asList(new Employee("jeka", salaries1), new Employee("Anna", salaries2));
        int totalSalaries = EmployeeUtil.totalSalaries(employees);
        Assert.assertEquals(66, totalSalaries);

    }

}