/*
Wipro Question
A) Find The Sum of Uncommon Numbers
        -->Given two integer arrays input1[] and input2[] ,extract the numbers which are present only in any one of the arrays (uncommon numbers)
        -->Calculate the sum of those numbers, lets call it sum1 and

B) Calculate single digit sum of sum1
       -->keep adding the digits of sum1 until you arrive at a single digit.
        -->Return that single digit as output.
*/
//piga is goo
package Arrays.Problems;
import java.util.*;

public class SumOfUncommonNumber {
    public static void main(String[] args) {
         int[] input1 = { 123, 45, 7890, 67, 2, 90 };
         int[] input2 = { 45, 7890, 123 };
//        int[] input1={1,2,3,40,50};
//        int[] input2={1,2,3};
        int sum = 0;


         /*Using a hashmap we are making a key value pair to get the keys whose frequencies are 1 because those
           are the required uncommon values.*/
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i:input1) {
            hm.put(i,1);
        }
        for(int i:input2){
            hm.merge(i,1,Integer::sum);
        }

        for(int i:hm.keySet()){
            if(hm.get(i)==1){
              sum+=i;
            }
        }


        // jotokkhon na digit gulor sum akta digit hocche, keep calculating sum of digits.
        while ((int) Math.log10(sum)+1 != 1) {
            sum = SumOfDigits(sum);
        };
        
        System.out.println(sum);
    }

    //USING WHILE LOOP
    // static int SumOfDigits(int a) {
    //     int sumvalue = 0;
    //     while (a > 0) {
    //         sumvalue += (a % 10);
    //         a /= 10;
    //     }
    //     return sumvalue;
    // }

    //USING RECURSION
    static int SumOfDigits(int a) {
        if(a%10==a)return a;
        return a%10+SumOfDigits(a/10);
    }
}


