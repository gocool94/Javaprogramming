public class EvenOddMethod {

    public static void main(String[] args){

        //CheckEven(66);

        for (int i =0;i<100;i++){
            System.out.println(i);
            System.out.print("");
            CheckEven(i);
        }


    }

    public static void CheckEven(int number){

        if (number%2==0){
            System.out.println("This is a even number");
        } else {
            System.out.println("This is a odd number");
        }
    }
}
























