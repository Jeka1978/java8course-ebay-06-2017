package repeatable_annotations;

import lombok.Builder;
import lombok.Data;

/**
 * Created by Evegeny on 11/07/2017.
 */
@Data
@Builder
public class Product {
    private int id;
    private String name;
    private int price;
}
