package OOP.Assignments;
import java.util.Scanner;
public class Asgnmnt_2 {
   static String StringToInt(String a,String b){
    int num1 = 0, num2 = 0,sum_int;
    String sum_str=""; 

    for(int i = 0; i < a.length(); i++) 
        num1 = num1 * 10 + ((int)a.charAt(i) - 48);
   
    for(int i = 0; i < b.length(); i++)  
        num2 = num2 * 10 + ((int)b.charAt(i) - 48);
    sum_int=num1+num2;

    while (sum_int != 0) {
        sum_str=sum_int%10+sum_str;
        sum_int /= 10;
        
      }
    return (sum_str);
   }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number: ");  
        String str1= sc.nextLine();              
        System.out.print("Enter 2nd number: ");  
        String str2= sc.nextLine();                
        System.out.println("Sum of two numbers entered is "+ String.valueOf(StringToInt(str1, str2)));
        sc.close(); 
        
    }
}
