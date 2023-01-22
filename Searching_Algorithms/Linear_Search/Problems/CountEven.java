//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/

package Searching_Algorithms.Linear_Search.Problems;

public class CountEven {
    public static void main(String[] args) {
        int[] num = { 12, 123, 1234, 12345, 123456 };
        int even_counter = 0;
        for (int i = 0; i < num.length; i++) {
            if (count(num[i]) % 2 == 0) {
                even_counter++;
            }
        }
        System.out.println(even_counter);
    }

//Optimized appraoch for finding no of digits in a number
    static int count(int a) {
        if (a < 0)
            a = a * -1;
        if (a == 0) {
            return 0;
        }
        
        // System.out.println(counter);
        //actual return type of Math.log10() is double
        return (int)Math.log10(a)+1;
    }

    /* ********Another approach********** */

    // static int count(int a) {
    //     if (a < 0)
    //         a = a * -1;
    //     if (a == 0) {
    //         return 0;
    //     }
    //     int counter = 0;
    //     while (a > 0) {
    //         a = a / 10;
    //         counter++;
    //     }
    //     // System.out.println(counter);
    //     return counter;
    // }


    /* ********Another approach********** */

    // static int count(int a){
    // int counter=1;
    // while(a/1!=0){
    // a=a/10;
    // counter++;
    // }
    // // System.out.println(counter);
    // return counter;
    // }
}
 