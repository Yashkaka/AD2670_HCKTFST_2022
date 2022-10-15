package Basic_CF_Package;

import java.util.Vector;

public class CF5_vectors {

    public static void main(String[] args) {

        //initial capacity of vector is 10
        Vector<Integer> vector = new Vector<>();

        //adding element
        vector.addElement(10);
        vector.addElement(9);
        vector.addElement(8);
        vector.addElement(7);
        vector.addElement(6);

        System.out.println(vector);

        System.out.println("\nElement at index 1 is " + vector.elementAt(1));

        //insert element
        vector.insertElementAt(100, 0);

        //first and last element of vector
        System.out.println("\nFirst element of vector is :: " + vector.firstElement());
        System.out.println("Last element of vector is :: " + vector.lastElement());

        System.out.println();

        //remove element
        System.out.println(vector);
        System.out.println("\nRemoving 100... && element at index 2");

        Integer integer = 100;
        vector.remove((Integer) 100);
        vector.removeElementAt(2);

        System.out.println(vector);

        //capacity of vector
        System.out.println("\nCapacity of Vector is :: " + vector.capacity());

        //trim to size
        System.out.println("\nTrimming the vector to it's size...");
        vector.trimToSize();
        System.out.println("Capacity of vector is now " + vector.capacity());
        System.out.println("Size of vector is " + vector.size());
    }
}

/*
OUTPUT

[10, 9, 8, 7, 6]

Element at index 1 is 9

First element of vector is :: 100
Last element of vector is :: 6

[100, 10, 9, 8, 7, 6]

Removing 100... && element at index 2
[10, 9, 7, 6]

Capacity of Vector is :: 10

Trimming the vector to it's size...
Capacity of vector is now 4
Size of vector is 4
 */