package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Reimi");

        Set<String> mutable = new HashSet<>();
        mutable.add("Hilmi");
        mutable.add("Akbar");
        mutable.add("Muharrom");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Arief","Karditya","Hermawan");

//        set.add("Dudung"); ERROR
//        set.remove("Jajang"); ERROR
    }
}
