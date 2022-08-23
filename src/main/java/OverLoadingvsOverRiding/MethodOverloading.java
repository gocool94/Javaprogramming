package OverLoadingvsOverRiding;

public class MethodOverloading {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a,int b, int c) {

        return a + b + c;
    }


    public static void main(String args[]){

        System.out.println(add(4,5));

        System.out.println(add(1,2,3));
    }
}
