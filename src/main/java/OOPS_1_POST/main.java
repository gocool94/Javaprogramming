package OOPS_1_POST;

import OOPS_1_POST.SimpleCalculator;

public class main {

    public static void main(String[] args){

        SimpleCalculator calculator = new SimpleCalculator(12,13,"this"); // constuctor is created when the object is initiases




        System.out.println("add = "+calculator.Additionresult());
        System.out.println("subtract = "+calculator.subtractionresult());
        System.out.println("Multiply = "+ calculator.mulitiplicationresult());
        System.out.println("Division = "+ calculator.divisionresult());

    }


}



