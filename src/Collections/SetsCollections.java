package Collections;

import java.util.*;

public class SetsCollections {
    public static void main(String[] args) {
        //since sets are immutable, we have wrap set with HashSet like below
        Set<String> mySet = new HashSet<>(Set.of("Alamin", "Juma", "Magoti"));

        mySet.add("Mwachuo");

        System.out.println(mySet); //[Mwachuo, Alamin, Juma, Magoti] no sorting occurred
        System.out.println(mySet.contains("Alamin")); // return true );

        //The TreeSet class implements the SortedSet interface which extends the base Set interface.
        //sortedSet will always try to sort the data input
        SortedSet<String> stringSet = new TreeSet<>();
        stringSet.add("Alamin");
        stringSet.add("Magoti");
        stringSet.add("Mwachuo");
        stringSet.add("Juma");

        System.out.println(stringSet); //[Alamin, Juma, Magoti, Mwachuo] it was sorted

        SortedSet<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(10);
        sortedSet.add(15);
        sortedSet.add(13);
        sortedSet.add(21);
        sortedSet.add(17);
        System.out.println(sortedSet);

        /*The LinkedHashSet implementation spares its clients from the chaotic ordering provided by HashSet without
        incurring the increased time cost of operations associated with TreeSet. But LinkedHashSet requires more
        memory for storing elements.*/

        Set<Character> characters = new LinkedHashSet<>();

        for (char c = 'a'; c <= 'k'; c++) {
            characters.add(c);
        }

        System.out.println(characters); // [a, b, c, d, e, f, g, h, i, j, k]

        // getting a mutable set from an immutable one
        Set<String> countries = new HashSet<>(List.of("India", "Japan", "Switzerland"));

        countries.addAll(List.of("India", "Germany", "Algeria"));
        System.out.println(countries); // [Japan, Algeria, Switzerland, Germany, India]

        countries.retainAll(List.of("Italy", "Japan", "India", "Germany"));
        System.out.println(countries); // [Japan, Germany, India]

        countries.removeAll(List.of("Japan", "Germany", "USA"));
        System.out.println(countries); // [India]

        // method that allows us to check whether a set is a subset of (i.e. contained in) another set.
        Set<String> country = new HashSet<>(List.of("India", "Japan", "Algeria"));

        System.out.println(country.containsAll(Set.of())); // true
        System.out.println(country.containsAll(Set.of("India", "Japan")));   // true
        System.out.println(country.containsAll(Set.of("India", "Germany"))); // false
        System.out.println(country.containsAll(Set.of("Algeria", "India", "Japan"))); // true

        // sets are compared. Two sets are equal when they contain the same elements.
        // Equality does not depend on the types of sets themselves

        Objects.equals(Set.of(1, 2, 3), Set.of(1, 3));    // false
        Objects.equals(Set.of(1, 2, 3), Set.of(1, 2, 3)); // true
        Objects.equals(Set.of(1, 2, 3), Set.of(1, 3, 2)); // true

        Set<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Objects.equals(numbers, Set.of(1, 2, 3)); // true    }
    }
}