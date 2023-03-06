package programmer.zaman.now.collection.data;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();

        map.put("Telor", "Ayam");
        map.put("Minyak", "Bimoli");
        map.put("Bumbu", "Royco");

        for (var value : map.keySet()){
            System.out.println(value);
        }
    }

}