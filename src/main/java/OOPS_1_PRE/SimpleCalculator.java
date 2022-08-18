package OOPS_1_PRE;

public class SimpleCalculator {
 /*
    Write a class with the name SimpleCalculator.
    The class needs two fields (instance variables) with names firstNumber and secondNumber
    both of type double.
Write the following methods (instance methods):
•	Method named getFirstNumber without any parameters,
it needs to return the value of firstNumber field. [DONE]
•	Method named getSecondNumber without any parameters,
it needs to return the value of secondNumber field.
•	Method named setFirstNumber with one parameter of type double,
it needs to set the value of the firstNumber field.
•	Method named setSecondNumber with one parameter of type double,
it needs to set the value of the secondNumberfield.
•	Method named getAdditionResult without any parameters,
it needs to return the result of adding the field values of firstNumber and secondNumber.
•	Method named getSubtractionResult without any parameters,
it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
•	Method named getMultiplicationResult without any parameters,
it needs to return the result of multiplying the field values of firstNumber and secondNumber.
•	Method named getDivision
     */


    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getsecondNumber(){
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){

       return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult(){

        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult(){

        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {

        if (this.firstNumber == 0 || this.secondNumber == 0) {
            return 0.0;
        } else {

            return this.firstNumber / this.secondNumber;
        }
    }


}
