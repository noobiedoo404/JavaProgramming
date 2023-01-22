package Recursion.PrintUpTo;

public class Basic {
    public static void main(String[] args) {
        // print(1,5);
        // print2(5,5);
        print3(5);
    }

    static void print(int i,int n){
        //haulting condition
        if(!(i>n)){System.out.println(i);
        print(++i,n);}
    }
    static void print2(int n,int i){
        i--;
        System.out.println(n-i);
        if(i==0)return ;
        print2(n,i);
    }

    //here recursion is not the last thing happening.
    //first we are calling the next function and at the last we are going to print the value we we are popping out of the stack.
    static void print3(int n){
        if(n==0)return ;
        print3(n-1);
        System.out.println(n);
    }
}
