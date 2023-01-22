package Recursion.SumUptoN;

public class Addition {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
//sum upto n using recursion
    static int sum(int n) {
        if (n > 0)
            return n + sum(n - 1);
        else
            return n;

    }
}
