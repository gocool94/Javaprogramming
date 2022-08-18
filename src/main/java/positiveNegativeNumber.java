public class positiveNegativeNumber {

    public static void main(String[] args){

        int inputNumber = 11;
        String results;

        if (inputNumber>0){
            results = "This is a positive integer";
            if (inputNumber>10){
                System.out.println("This number is greater than 10");
            }





        } else if (inputNumber <0) {
            results = "This is a negative integer";
        } else {
            results = "The value is 0";
        }

        System.out.println(results);



    }
}
