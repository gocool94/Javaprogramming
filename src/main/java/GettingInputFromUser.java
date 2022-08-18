import java.util.Scanner;

public class GettingInputFromUser {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Enter a Number - ");
        anner.nextInt();

        System.out.println(a);
        System.out.println("Enter b Number - ");
        int b = scanner.nextInt();


        System.out.println(b);
        System.out.println("The Addition of the number is " + (a+b));
        int a = sc

         */

        System.out.println("Enter First Number");
        int a = scanner.nextInt();
        EvenOddChecker(a);





    }

    public static void EvenOddChecker(int a) {

        if (a % 2 == 0) {
            System.out.println("This is a even number");
        } else {
            System.out.println("This is a Odd number");
        }
    }
}



//Voters checker program













