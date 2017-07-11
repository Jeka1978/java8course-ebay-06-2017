package stream_without_if;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static stream_without_if.Seniority.JUNIOR;
import static stream_without_if.Seniority.MIDDLE;
import static stream_without_if.Seniority.SENIOR;

/**
 * Created by Evegeny on 11/07/2017.
 */
public class EmplUtilTest {
    @Test
    public void mapEmployeesToSeniority() throws Exception {
        List<Employee> employees = Arrays.asList(new Employee(10000), new Employee(5000), new Employee(30000),
                new Employee(40000), new Employee(70000), new Employee(20000));


        Map<Seniority, List<Employee>> map = EmplUtil.mapEmployeesToSeniority(employees);
        Assert.assertTrue(map.get(JUNIOR).size()==2);
        Assert.assertTrue(map.get(MIDDLE).size()==1);
        Assert.assertTrue(map.get(SENIOR).size()==3);
    }

}













