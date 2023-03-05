package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Arief");
        collection.add("Karditya");
        collection.add("Hermawan");
        collection.addAll(List.of("Sedang","Belajar","Java"));

        for (var value : collection){
            System.out.println(value);
        }

        System.out.println();
        System.out.println("REMOVE DATA");

        collection.removeAll(List.of("Karditya","Hermawan"));
        collection.remove("Sedang");
        collection.remove("Lagi"); //boolean bernilai false karena tidak ada datanya dalam "collection"

        for (var value : collection){
            System.out.println(value);
        }

        System.out.println();
        System.out.println("Check Data");
        System.out.println(
                collection.contains("Arief")
        );

        System.out.println(
                collection.containsAll(List.of("Belajar","Java"))
        );

        System.out.println(
                collection.containsAll(List.of("Truck"))
        );

    }
}
