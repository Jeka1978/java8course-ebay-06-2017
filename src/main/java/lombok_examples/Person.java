package lombok_examples;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 09/07/2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Slf4j
public class Person {
    private String name;
    private int age;

    @NonNull
    @Singular
    private List<String> beers;


    public static void main(String[] args) {
        log.info("blablbal");
        PersonBuilder builder = Person.builder().age(18).name("Beni");

        for (int i = 0; i < 3; i++) {
            String beerName = JOptionPane.showInputDialog("input your favorite beer: ");
            builder.beer(beerName);
        }
        Person person = builder.build();


        System.out.println("person = " + person);
    }

}
