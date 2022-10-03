package InputOutputException;

public class ThrowException {

    public static void DivideByZero() {

        //throw a exception

        throw new ArithmeticException("Trying to divide by Zero");
    }

    public static void main(String[] args) {

        DivideByZero();
    }
}
