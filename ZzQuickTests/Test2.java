package ZzQuickTests;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        System.out.println(-Math.pow(2,7) +" to "+ (Math.pow(2,7)-1));
        System.out.println(-Math.pow(2,15)+" to "+(Math.pow(2,15)-1));
        System.out.println(-Math.pow(2,31) +" to "+ (Math.pow(2,31)-1));
        System.out.println(-Math.pow(2,63) +" to "+ (Math.pow(2,63)-1));
        Scanner in=new Scanner(System.in);


        System.out.println(in.next()+" is online");
        in.close();

    }
}
