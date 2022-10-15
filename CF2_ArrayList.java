package Basic_CF_Package;

import java.util.ArrayList;
import java.util.Iterator;

public class CF2_ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(1);

        //getting the index of the element
        System.out.println("Index of (first) 1 :: " + arrayList.indexOf(1));
        System.out.println("Index of (last) 1 :: " + arrayList.lastIndexOf(1));

        System.out.println("Element at index 2 is " + arrayList.get(2));

        //print arrayList using iterator
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        //Removing the element
        System.out.println("Removing Element at index 2...");
        arrayList.remove(2);

        System.out.println("\nNow the list is ");
        System.out.println(arrayList);

        //setting (replacing) the element
        arrayList.set(0, 2);
    }
}

/*
OUTPUT

Index of (first) 1 :: 0
Index of (last) 1 :: 4
Element at index 2 is 3
1 2 3 4 1 Removing Element at index 2...

Now the list is
[1, 2, 4, 1]

 */