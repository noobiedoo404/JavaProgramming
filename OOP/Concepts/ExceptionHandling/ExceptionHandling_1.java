package OOP.Concepts.ExceptionHandling;
import java.util.Scanner;
public class ExceptionHandling_1 {
    
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj= new Scanner(System.in);
        try {
            System.out.print("Enter a: ");
            a=obj.nextInt();
            System.out.print("Enter b: ");
            b=obj.nextInt();
            c=a/b;
            System.out.println(a+"/"+b+"= "+c);
        }
         catch (ArithmeticException e) {
            System.out.println("Denominator can't be zero.\nEnter a,b again :)");
        }   
        finally{
            obj.close();
        }
    }
    


}