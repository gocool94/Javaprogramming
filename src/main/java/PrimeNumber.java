public class PrimeNumber {

    public static void main(String[] args){
        int  num=19;
        int count=0;

        for(int i=1;i<=num/2;i++){

            if(num%i==0){
                count++;
            }

        }

        if(count==2){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }

}
