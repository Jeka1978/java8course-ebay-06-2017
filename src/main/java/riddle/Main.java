package riddle;

import java.util.ArrayList;

/**
 * Created by Evegeny on 09/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> heroes = new ArrayList<>();
        heroes.add("Anrnold");
        heroes.add("Stallone");
        heroes.add("Chuck Norris");
        heroes.add("Bruce Willis");

        String heroToRemove = "Bruce Willis";

        heroes.removeIf(s -> s.equalsIgnoreCase(heroToRemove));

        System.out.println(heroes);

















    }

}
