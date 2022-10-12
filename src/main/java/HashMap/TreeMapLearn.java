package HashMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapLearn {
    public static void main(String[] args) {

        Map<String,Integer> values = new TreeMap<>();


        values.put("Second",2);
        values.put("Third",3);
        values.put("First",1);

        System.out.println("Map using tree map" + values);

        // Replace the values


        values.replace("First",11);

        System.out.println("Values after replacing will be "+ values);

        // remove the elements from the map

        int removedvalue = values.remove("Third");

        System.out.println("New Map values are" + removedvalue);



    }
}
