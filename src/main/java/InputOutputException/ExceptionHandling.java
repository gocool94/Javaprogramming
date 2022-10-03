package InputOutputException;

public class ExceptionHandling {

    public static void main(String[] args) {


        try {

            int divideByZero = 5/1;
            System.out.println(divideByZero);

        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());


        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Anywhich ways this will run even if i have errors");
        }


    }
}
