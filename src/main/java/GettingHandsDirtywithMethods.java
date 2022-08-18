import java.util.Scanner;

public class GettingHandsDirtywithMethods {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Addtion 2.Subtraction 3.Multiply 4.Divide");
        int number = scanner.nextInt();
        int value = 0;
        System.out.println("Enter the First Number");
        int a = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int b = scanner.nextInt();
        switch (number) {

            case 1 :
                 value = sum(a,b);
                break;

            case 2:
                value = subtract(a,b);
                break;

            case 3:
                value = multiply(a,b);
                break;

            case 4:
                value = divide(a,b);
                break;

            default:
                System.out.println("No value has been provided");
                break;
        }


        System.out.println(value);


    }


    public static int sum(int a ,int b){
       return a+b;
    }

    public static int subtract(int a ,int b){
        return a-b;
    }

    public static int multiply(int a ,int b){
        return a*b;
    }

    public static int divide(int a ,int b){
        return a/b;
    }
}















/*
1) Write a program to to swap two numbers without using a third variable?
2)Find the range of maximum and minimum value of data type?
3)String concatenation in java?
4)Convert a STRING from Uppercase to Lowercase in java
5) Create a pattern like below



                *
                * *
                * * *
                * * * *
                * * * * *











                */





































