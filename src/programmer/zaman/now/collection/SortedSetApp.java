package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;
import programmer.zaman.now.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Hilmi"));
        people.add(new Person("Arief"));
        people.add(new Person("Budi"));
        people.add(new Person("Chandra"));
        people.add(new Person("Debian"));
        people.add(new Person("Eriq"));
        people.add(new Person("Fortran"));
        people.add(new Person("Gabriel"));
        people.add(new Person("Intan"));
        people.add(new Person("Thoriq"));
        people.add(new Person("Rizky"));

        for (var person : people){
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        sortedSet.add(new Person("Bujang"));
    }
}
