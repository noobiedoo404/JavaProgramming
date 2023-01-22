//finding sum of digits using recursion
package Recursion.SumOfDigits;

public class Main {
    public static void main(String[] args) {
        System.out.println(SumOfDigits(1234)); 
    }

    static int SumOfDigits(int num){

        if(num==0)return 0;
        int rem=num%10;
        num=num/10;
        return rem+SumOfDigits(num);

    }
}
