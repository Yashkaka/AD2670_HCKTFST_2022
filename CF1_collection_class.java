package Basic_CF_Package;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CF1_collection_class {

    public static void main(String[] args) {

        ArrayList<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");
        collection.add("Goa");

        System.out.println("A list of cities in collection 1");
        Iterator<String> iterator = collection.iterator();

        //iterate through the list (collection)
        while (iterator.hasNext()){
            System.out.print(iterator.next().toUpperCase() + " ");
        }

        System.out.print("\nIs Dallas is in the collection ? :: ");
        System.out.println(collection.contains("Dallas"));

        collection.remove("Dallas");

        Collection<String> collection1 = new ArrayList<>();
        collection1.add("Mumbai");
        collection1.add("Jaipur");
        collection1.add("Pune");
        collection1.add("Goa");

        System.out.println("\nCities in Collection2 is");
        System.out.println(collection1);

        //Union Operation
        ArrayList<String> c1 = (ArrayList<String>) collection.clone();
        c1.addAll(collection1);

        System.out.println("Collection of both Cities");
        System.out.println(c1);

        //Intersection Operation
        c1 = (ArrayList<String>) collection.clone();
        c1.retainAll(collection1);
        System.out.print("\nCities in collection1 AND collection2 is :: ");
        System.out.println(c1);

        //Difference Operation
        c1 = (ArrayList<String>) collection.clone();
        c1.removeAll(collection1);

        System.out.print("\nCities in Collection1 but not in collection2 :: ");
        System.out.println(c1);
    }
}
