package Queue;

import java.util.LinkedList;

public class LinkedlistExample {

    public static void main(String[] args) {

        //Create a LinkedList

        LinkedList<String> animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("Liger");
        animals.add("Tiger");

        System.out.println("Linked List " + animals);

        // add with a index parameter

        animals.add(1,"Lion");
        System.out.println("Updated LinkedList  " + animals);


        // get the elements from the linkedList

        String str = animals.get(3);
        System.out.println("Elements at the index 3 " + str );


        // remove the elements from the linkedList

        String str1 = animals.remove(3);
        System.out.println("Elements after removal " + animals );

        //Changing the elements from the LinkedList+

        animals.set(2,"Null");
        System.out.println("Elements after changing is " + animals );


    }
}
