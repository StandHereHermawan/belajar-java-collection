package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleTon = Collections.singletonMap("name","Sudo");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name","Hilmi");
        Map<String , String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first"," Arief",
                "second"," Hilmi",
                "third"," Aryo",
                "fourth"," Andhika"
        );

        System.out.println(map);

//        map.put("a","A"); ERROR
    }
}
