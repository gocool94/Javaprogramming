public class SwitchStatements {

    public static void main(String[] args){

        int SizeNumber = 2;

        String size;


        switch (SizeNumber) {

            case 30:
                size = "Small";
                break;


            case 32:
                size = "Medium";
                break;

            case 40:
                size = "Large";
                break;

            case 42:
                size = "Extra Large";
                break;

            default:
                size = "unknown size";
                break;

        }

        System.out.println(size);
    }
}
