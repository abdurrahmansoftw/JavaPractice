// java Collection example:

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a collection
        Collection<String> collection = new ArrayList<String>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        System.out.println("A list of cities in collection:");
        System.out.println(collection);

        System.out.println("Is Dallas in collection? " + collection.contains("Dallas"));

        collection.remove("Dallas");
        System.out.println("Dallas is removed from collection");

        System.out.println("Is Dallas in collection? " + collection.contains("Dallas"));

        Collection<String> collection2 = new ArrayList<String>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        System.out.println("A list of cities in collection2:");
        System.out.println(collection2);

        System.out.println("Is collection2 a subset of collection? " + collection.containsAll(collection2));

    }
}