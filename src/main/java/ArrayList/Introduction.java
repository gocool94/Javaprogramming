package ArrayList;

import java.util.ArrayList;

public class Introduction {

    public static void main(String[] args) {
        ArrayList<String> ProgrammingLanguages = new ArrayList<>();

        ProgrammingLanguages.ensureCapacity(20);
        //Add elements to ArrayList

        ProgrammingLanguages.add("Java");
        ProgrammingLanguages.add("Python");
        ProgrammingLanguages.add("Flutter");
        ProgrammingLanguages.add("PHP");

        System.out.println("Array List  " + ProgrammingLanguages);


        //Accessing the elements using ArrayList

        System.out.println(ProgrammingLanguages.get(2));


        //Change the Array Elements

        ProgrammingLanguages.set(2,"Dart");

        System.out.println("Array List after Changing is "+ProgrammingLanguages);


        //Remove the Array Elements

        ProgrammingLanguages.remove(3);

        System.out.println("Array List after Removing is " + ProgrammingLanguages);


        //Increase the capacity in Array List

        //ProgrammingLanguages.ensureCapacity(20); //The List can hold 20 values


        // Reducint the current capacity

        ProgrammingLanguages.trimToSize();

        //How to check length of the array

        System.out.println("Size of Array List " + ProgrammingLanguages.size());

        // How to check if the ArrayList is Empty or not

        System.out.println("Check if the size is empty or not " + ProgrammingLanguages.isEmpty());

        //How to check if an element is present in an Array List

        System.out.println("Check if an element is present in the ArrayList "+ ProgrammingLanguages.contains("Dart"));
        System.out.println("Check if an element is present in the ArrayList "+ ProgrammingLanguages.contains("HTML"));


    }
}
