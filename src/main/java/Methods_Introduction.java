import java.util.Locale;

public class Methods_Introduction {

    public static void main(String[] args){

        int value = sum(7,8);
        System.out.println(value);
        String name;
        name = "Corona";
        System.out.println(name.toUpperCase(Locale.ROOT));


    }

    //Method -> block of code / collection of statments

        // Easy modification towards a code
        // Readability
        // small chunk of code is being used in another codes.

    public static int sum (int a,int b){
        int Addtion = a + b;
        return Addtion;
    }


}
