package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("Arief");
        strings.add("Karditya");

        strings.set(0,"Reimi");

        strings.remove(1);
        System.out.println(strings.get(0));

        for (var value : strings){
            System.out.println(value);
        }
    }
}
