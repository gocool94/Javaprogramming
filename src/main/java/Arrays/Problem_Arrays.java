package Arrays;
//Compute Sum and Average of Array Elements
public class Problem_Arrays {
    public static void main(String[] args) {

        int[] numbers = {10,22,34,6,34,3457,345,77,53,44,4,6,5,7};

        int sum = 0;

        for (int i =0;i<=numbers.length-1;i++){
            sum+=numbers[i];
            System.out.println("The Array value for " +i+ " is " +numbers[i]);
        }

        System.out.println(sum);

        double average = (double)sum / (double) numbers.length;

        System.out.println(average);
    }
}
