package OOP.Assignments;

import java.util.Scanner;
 
public class Asgnmnt_3 {
 
    static int n=10;
    public static void main(String args[])
    {
        String a;
        Scanner sc =new Scanner(System.in);
        a=sc.nextLine();
        int count[] = new int[n];

        for (int i = 0; i < n; i++)
            count[i]=0;
 
        for (int i = 0; i < a.length(); i++)
            count[(int)(a.charAt(i))-48]++;

        int odd = 0;
        for (int i = 0; i < n; i++) {
            if (count[i] == 1)
                odd++;
 
            if (odd > 1){
                System.out.println("Palindrome not possible.");
                break;
            }
            if(i==n-1)System.out.println("Palindrome's possible.");
        }
        
     sc.close();
}
}
