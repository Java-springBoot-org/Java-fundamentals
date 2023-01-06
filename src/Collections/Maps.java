package Collections;

import java.time.LocalDate;
import java.util.*;

public class Maps {
    public static void main(String[] args) {
       /* The simplest way to create a map is to invoke the of method of the Map interface. The method takes zero or any
        even number of arguments in the format key1, value1, key2, value2, ... and return an immutable map.*/
        Map<String, String> emptyMap = Map.of();

        Map<String, String> friendPhones = Map.of(
                "Bob", "+1-202-555-0118",
                "James", "+1-202-555-0220",
                "Katy", "+1-202-555-0175"
        );
        System.out.println(emptyMap.size());     // 0
        System.out.println(friendPhones.size()); // 3

        //get a value from a map by its key:
        String bobPhone = friendPhones.get("Bob"); // +1-202-555-0118
        String alicePhone = friendPhones.get("Alice"); // null
        String phone = friendPhones.getOrDefault("Alex", "Unknown phone"); // Unknown phone

        //using containsKeys or containsValue to check if keys/values are available
        System.out.println(friendPhones.keySet()); // [James, Bob, Katy]
        System.out.println(friendPhones.values()); // [+1-202-555-0220, +1-202-555-0118, +1-202-555-0175]

        //HashMaps HashMap class represents a map backed by a hash table.
        Map<Integer, String> products = new HashMap<>();

        products.put(1000, "Notebook");
        products.put(2000, "Phone");
        products.put(3000, "Keyboard");

        System.out.println(products); // {2000=Phone, 1000=Notebook, 3000=Keyboard}

        System.out.println(products.get(1000)); // Notebook

        products.remove(1000);

        System.out.println(products.get(1000)); // null

        products.putIfAbsent(3000, "Mouse"); // it does not change the current element

        System.out.println(products.get(3000)); // Keyboard


        //The LinkedHashMap stores the order in which elements were inserted.
        Map<Integer, String> product = new LinkedHashMap<>(); // ordered map of products

        product.put(1000, "Notebook");
        product.put(2000, "Phone");
        product.put(3000, "Keyboard");

        System.out.println(product); // it's always ordered {1000=Notebook, 2000=Phone, 3000=Keyboard

       /* The TreeMap class represents a map that gives us guarantees on the order of the elements. It is corresponding
        to the sorting order of the keys determined either by their natural order (if they implement the Comparable interface)
        or by specific Comparator implementation.*/

        SortedMap<LocalDate, String> events = new TreeMap<>();

        events.put(LocalDate.of(2017, 6, 6), "The Java Conference");
        events.put(LocalDate.of(2017, 6, 7), "Another Java Conference");
        events.put(LocalDate.of(2017, 6, 8), "Discussion: career or education?");
        events.put(LocalDate.of(2017, 6, 9), "The modern art");
        events.put(LocalDate.of(2017, 6, 10), "Coffee master class");

        LocalDate fromInclusive = LocalDate.of(2017, 6, 8);
        LocalDate toExclusive = LocalDate.of(2017, 6, 10);

        System.out.println(events.subMap(fromInclusive, toExclusive));
    }
}
