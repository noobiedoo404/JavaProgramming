package Recursion.ProdOfDigits;

public class Main {
    public static void main(String[] args) {
        System.out.println(prod(1234));
    }
    static int prod(int num){
        if(num%10==num){
            return num;
        }
        return num%10*prod(num/10);
    }
}
