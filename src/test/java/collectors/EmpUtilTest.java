package collectors;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static collectors.Gender.FEMALE;
import static collectors.Gender.MALE;
import static org.junit.Assert.*;

/**
 * Created by Evegeny on 11/07/2017.
 */
public class EmpUtilTest {
    @Test
    public void isManEmployeesMoreExpensive() throws Exception {
        List<Employee> employees = Arrays.asList(new Employee(10, MALE),
                new Employee(20, MALE), new Employee(40, FEMALE));
        Assert.assertEquals(false, EmpUtil.isManEmployeesMoreExpensive(employees));
        List<Employee> employees2 = Arrays.asList(new Employee(10, MALE),
                new Employee(20, MALE), new Employee(20, FEMALE));
        Assert.assertEquals(true, EmpUtil.isManEmployeesMoreExpensive(employees2));

    }

}