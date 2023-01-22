//https://www.geeksforgeeks.org/java-program-for-sieve-of-eratosthenes/

// Java program to print all primes smaller than n using Sieve of Eratosthenes
// if asked for smaller or equal to n, take array size as n+1, run the inner loop till n

package Arrays.Problems;
import java.util.Arrays;

public class CountPrime {
    public static void main(String[] args) {
         System.out.println(func(100));
//        func2(7);
    }
    static int func(int n){
        if(n<3)return 0;
        boolean[] arr=new boolean[n];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++){

            // less optimized
//            for(int j=i*2;j<n;j+=i){
//                if(j%i==0 && arr[j]==true){
//                    arr[j]=false;
//                }
//            }
            // more optimized !!
            if(arr[i]==true){
                for (int j = i*i; j <n ; j+=i) {
                   arr[j]=false;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i])count++;
//            System.out.println(arr[i]);
        }
        return count;
    }


    static void func2(int n){
        if(n<2){
            System.out.println("not prime");
            return ;   
        }
        
         

        boolean[] arr=new boolean[n];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            for(int j=i;j<n;j+=i){
                if(n%j==0 && arr[j]==true){
                    System.out.println("not prime");
                    return ;
                }
                arr[j]=false;
            }
        }
        // for(int i=0;i<n;i++){
        //     if(arr[i]){
        //         System.out.println("not prime");
        //         return ;
        //     }
        // }
        System.out.println("prime");
        return ;
    }
}
