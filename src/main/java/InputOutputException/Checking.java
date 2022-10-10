package InputOutputException;

public class Checking {

    public static void main(String[] args) {
        try {

            if (1 > 3) {
                System.out.println("This is true");
            }
        }

        catch (Exception e) {

            System.out.println("This is an error");
        }

    }
}
