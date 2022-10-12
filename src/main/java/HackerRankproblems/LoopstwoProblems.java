package HackerRankproblems;

import java.util.*;
import java.io.*;

public class LoopstwoProblems {


        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int q=in.nextInt(); // series
            for(int i=0;i<q;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                double sum = 0.0;

                for ( int j = 0; j<n ; j++) {

                    double total = 0.0;
                    for (int temp = 0 ; temp <= j ; temp++ ){
                        total+= Math.pow(2,temp) * b;
                    }

                    sum = a + total;
                    System.out.print(Math.round(sum) + " ");
            }System.out.println();
            in.close();
        }
    }
}
