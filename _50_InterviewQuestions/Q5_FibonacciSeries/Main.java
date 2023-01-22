package _50_InterviewQuestions.Q5_FibonacciSeries;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibo(5));
        printFibo(5);
    }

    static int fibo(int num){
        if(num<2) return num;

        //we can omit the else below
        // else{
        //     return fibo(num-2)+fibo(num-1);
        // }
        return fibo(num-1)+fibo(num-2);
    }
//printing fibonacci series
    static void printFibo(int num){
        int a=0;
        int b=1;
        int c=1;
        for(int i=0;i<num;i++){
            System.out.print(a+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
