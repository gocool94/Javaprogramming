package OOPS_1_POST;

public class ScientificCalculator extends SimpleCalculator {

    //create a two method squares and cubes

    public ScientificCalculator(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }

    public ScientificCalculator() {
    }

    public ScientificCalculator(double one, double two, String three) {
        super(one, two, three);
    }

    //squares = a * a
    // cubes = a * a * a




    public double Calculatesquares() {

        return this.getFirstNumber() * this.getFirstNumber();
    }


    public double Calculatecubes() {

        return  this.getFirstNumber() * this.getFirstNumber() * this.getFirstNumber();
    }






}
