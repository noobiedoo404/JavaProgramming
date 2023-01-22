package Strings.MixedQuestions;
import java.util.*;
public class TakingInput {
    public static void main(String[] args) {

    //revisited
    Scanner s= new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int inStr= s.nextInt();
    System.out.println(inStr);
    System.out.print("Enter a string : ");
    String inStr1= s.nextLine();
    String[] inarr= inStr1.split(",");
    System.out.print("array items: ");
    for (int i=0;i<inarr.length;i++){
        System.out.print(inarr[i]);
    }
    // System.out.println(inStr);
    

     s.close();




















    //    int a,b,sum;
    //    Scanner obj =new Scanner(System.in);
    //    System.out.print("Enter a: ");
    //    a=obj.nextInt();
    //    System.out.print("Enter b: ");
    //    b=obj.nextInt();
    //    sum=a+b;
    //    System.out.print("Sum of a and b is: "+ sum );
       
    //   obj.close();

// int a,b,c;
// Scanner obj =new Scanner(System.in);
// System.out.print("Enter a: ");
// a=obj.nextInt();
// System.out.print("Enter b: ");
// b=obj.nextInt();
// c=a+b;
// System.out.println("a+b= "+c);
// obj.close();



    }
}
