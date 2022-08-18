package OOPS_Problems;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        SimpleCalculator GokulsCalculator = new SimpleCalculator(); //initialised
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ---");
        double fnumber = scanner.nextInt();
        System.out.println("Enter the Second number  ---");
        double snumber = scanner.nextInt();
        GokulsCalculator.setFirstNumber(fnumber);
        GokulsCalculator.setSecondNumber(snumber);

        //switch case statement

        System.out.println( "Enter your operation Choice ---> \n 1 -> Addition \n 2 -> Subtraction \n 3 -> Multiplication \n 4 -> Division ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("The Additional result is " + GokulsCalculator.getAdditionResult());
                break;

            case 2:
                System.out.println("The Subtraction result is " + GokulsCalculator.getSubtractionResult() );
                break;

            case 3:
                System.out.println("The Multiplication result is " +GokulsCalculator.getMultiplicationResult());
                break;

            case 4:
                System.out.println("The Division result is " +GokulsCalculator.getDivisionResult());
                break;

            default:
                System.out.println("The Given choice is not valid");


        }





    }
}
