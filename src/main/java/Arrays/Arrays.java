package Arrays;

public class Arrays {

    public static void main(String[] args) {

        //datatype[] arrayName; - > Declare the array

        //int[] data;

        //allocate the memory

        //data = new int[10];


        //Another Method

        int[] data = new int[10];

        for (int i = 0;i <=data.length-1;i++) {

            data[i] = i * 2;
            System.out.println(i +"is stored with " + data[i]);
        }

        System.out.println(data[6]);


        //declare and intialize an array

        int[] age = {1,2,3,4,5,6,7,8};
    }
}
