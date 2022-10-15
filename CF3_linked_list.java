package Basic_CF_Package;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class CF3_linked_list {

    public static void main(String[] args) {

        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(9);
        linkedList.add(8);
        linkedList.add("Green");
        linkedList.add("Blue");

        System.out.println("Linked List is ");
        System.out.println(linkedList);

        //Create ArrayList and Assign it to linked list
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        LinkedList<Object> linkedList1 = new LinkedList<>(arrayList);
        System.out.println("\nLinked List 2 is ");
        System.out.println(linkedList1);

        linkedList1.addLast("Java");
        linkedList1.addFirst("C++");
        linkedList1.add("C");

        System.out.println("\nNow the Linked List is ");
        System.out.println(linkedList1);

        System.out.println("\nPrinting LL2 in Reverse order");
        ListIterator<Object> iterator = linkedList1.listIterator(linkedList1.size());
        while (iterator.hasPrevious())
            System.out.print(iterator.previous() + " ");
    }
}

/*
OUTPUT

Linked List is
[10, 9, 8, Green, Blue]

Linked List 2 is
[1, 2, 3, 4]

Now the Linked List is
[C++, 1, 2, 3, 4, Java, C]

Printing LL2 in Reverse order
C Java 4 3 2 1 C++
 */