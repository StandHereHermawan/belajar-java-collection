package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Arief","Arief");
        map.put("Hilmi","Hilmi");
        map.put("Aryo","Aryo");

        for (var key : map.keySet()){
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Arief"));
        System.out.println(map.higherKey("Arief"));

        NavigableMap<String, String> mapDescend = new TreeMap<>();

        for (var key : mapDescend.keySet()){
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDescend);

        System.out.println(immutable);
    }
}
