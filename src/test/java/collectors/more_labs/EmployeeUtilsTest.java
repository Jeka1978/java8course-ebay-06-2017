package collectors.more_labs;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 11/07/2017.
 */
public class EmployeeUtilsTest {
    @Test
    public void getEmployeesByCompany() throws Exception {
        List<Employee> employees = Arrays.asList(
                Employee.builder().name("Beni").companyName("ebay").build(),
                Employee.builder().name("Pavel").companyName("ebay").build(),
                Employee.builder().name("Jeka").companyName("naya").build()
        );

        Map<String, List<Employee>> map = EmployeeUtils.getEmployeesByCompany(employees);
        System.out.println("map = " + map);
        Assert.assertTrue(map.get("ebay").size()==2);
        Assert.assertTrue(map.get("naya").size()==1);


        Map<String, Long> perCompany = EmployeeUtils.getNumberOfEmployeesPerCompany(employees);
        Assert.assertTrue(perCompany.get("ebay")==2);
        Assert.assertTrue(perCompany.get("naya")==1);

    }

}