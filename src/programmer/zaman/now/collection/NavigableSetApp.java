package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Arief","Budi","Chandra","Denis"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> budi = names.headSet("Budi", true);
        NavigableSet<String> budi1 = names.tailSet("Budi", false);

        for (var name : budi) {
            System.out.println(name);
        }

        for (var name : budi1) {
            System.out.println(name);
        }

        NavigableSet<String> imutable = Collections.unmodifiableNavigableSet(names);
        imutable.add("ups");
    }
}
