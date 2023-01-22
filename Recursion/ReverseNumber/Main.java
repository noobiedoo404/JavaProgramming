package Recursion.ReverseNumber;

public class Main {
    public static void main(String[] args) {
        System.out.println(func(1234));
    }
    static int func(int num){
        if(num%10==num)return num;
        return (num%10)*(int)Math.pow(10, (int)Math.log10(num))+func(num/10);
    }
}
