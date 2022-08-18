package OOPS_1_POST;

public class SimpleCalculator {
    private double firstNumber;
    private double SecondNumber;

    public SimpleCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.SecondNumber = secondNumber;
    }


    public SimpleCalculator(){
        System.out.println("Constuctor is created but the values are not SET so Set the values using getters and setter");
    }


    public SimpleCalculator(double one, double two,String three){

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }

    public void setFirstNumber(double fnumber) {

         this.firstNumber = fnumber;
    }


    public double getFirstNumber() {


        return this.firstNumber;

    }

    public void setSecondNumber (double snumber) {

        this.SecondNumber = snumber;
    }

    public double getSecondNumber() {

        return this.SecondNumber;
    }


    public double Additionresult() {

        return this.firstNumber + this.SecondNumber;
    }

    public double subtractionresult() {

        return this.firstNumber - this.SecondNumber;
    }

    public double mulitiplicationresult() {

        return this.firstNumber * this.SecondNumber;
    }

    public double divisionresult() {
        if (this.firstNumber == 0 || this.SecondNumber == 0) {
            return 0.0;
        } else {

            return this.firstNumber / this.SecondNumber;
        }

    }


}
