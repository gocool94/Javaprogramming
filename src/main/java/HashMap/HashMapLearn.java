package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearn {

    public static void main(String[] args) {

        // Create a map function using the hashmap

        Map<String,Integer> numbers = new HashMap<>();

        // Insert elements to the map

        numbers.put("Five",5);
        numbers.put("Six",6);
        numbers.put("Seven" , 7);
        numbers.put("Eight",8);

        //Access keys of the map

        System.out.println("Keys : " + numbers.keySet());


        //Access values of the map

        System.out.println("Values :" +numbers.values());

        //Access entries of the map

        System.out.println("Entries " + numbers.entrySet());

        //Remove an element from the map

        int value = numbers.remove("Six");

        System.out.println("Successfully removed " + value);

        System.out.println("AFter deleting the key value pairs");

        System.out.println(numbers.entrySet());

        //Iterate over a hashmap


    }
}
