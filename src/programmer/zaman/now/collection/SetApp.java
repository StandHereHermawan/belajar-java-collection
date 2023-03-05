package programmer.zaman.now.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

//        Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();

        names.add("Arief");
        names.add("Karditya");
        names.add("Hermawan");
        names.add("Hilmi");
        names.add("Akbar");
        names.add("Muharrom");

        for (var name : names) {
            System.out.println(name);
        }

    }
}
