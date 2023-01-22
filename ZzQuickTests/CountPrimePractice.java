package ZzQuickTests;
import java.util.*;

// Java program to print all primes smaller than n using Sieve of Eratosthenes
// if asked for smaller or equal to n, take array size as n+1, run the inner loop till n
public class CountPrimePractice {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean[] array=new boolean[n];
        for (int i = 0; i <n ; i++) {
            array[i]=true;

        }
        array[0]=false;
        array[1]=false;


        for (int i = 2; n>=i*i ; i++) {
//            for (int j = i*2; j <n ; j+=i) {
//                if(array[j]==true){
//                    array[j]=false;
//                }
//
//            }
           // more optimized !!
            if(array[i]==true){
                for (int j = i*i; j <n ; j+=i) {
                    array[j]=false;
                }
            }
        }
            System.out.println("prime numbers are");
        int count=0;
        for (int i = 2; i <n ; i++) {
            if(array[i])
            count++;
        }

        System.out.println("no of primes "+count);

    }
}
