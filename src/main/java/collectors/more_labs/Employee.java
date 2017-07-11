package collectors.more_labs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Created by Evegeny on 11/07/2017.
 */
@Data
@AllArgsConstructor
@Builder
public class Employee {
    private String name;
    private String companyName;
}
