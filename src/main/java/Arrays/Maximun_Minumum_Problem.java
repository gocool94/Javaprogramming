package Arrays;

public class Maximun_Minumum_Problem {

    public static void main(String[] args) {

        //sorted array = {1,2,3,4,5,6,7,8,9,10}
        //unsorted array = {2,3,1,6,5}

        int[] Numbers = {3,34,2365,467,34537,2345,5,563467,245,3457548,35634573,23434636};

        int MaximumNumber = 0;

        for (int i = 0;i<=Numbers.length-1;i++) {

            if (MaximumNumber < Numbers[i]){
                MaximumNumber = Numbers[i];
            }


        }
        System.out.println("Maximum number is " + MaximumNumber);
    }
}
