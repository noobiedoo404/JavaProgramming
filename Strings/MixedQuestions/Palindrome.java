package Strings.MixedQuestions;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        while(true){
            String s= Integer.toString(a);
            String t="";
            for(int i=0;i<s.length();i++){
                   t=t+s.charAt(s.length()-i-1);
            }
            // System.out.println(t);
            int t1=Integer.parseInt(t);
            // System.out.println(t1);

            int t2=a+t1;
            String s1=Integer.toString(t2);
            // System.out.println(t2);
            // System.out.println("s1="+s1);


            String s1_rev="";
            for(int i=0;i<s1.length();i++){
                s1_rev=s1_rev+s1.charAt(s1.length()-i-1);
            }
            // int s1_int=Integer.parseInt(s1);
            // int s1_rev_int=Integer.parseInt(s1_rev);
            // System.out.println("S1="+ s1_rev);
            // System.out.println("S1_rev="+ s1_rev);
            // System.out.println(s1==s1_rev);
            // System.out.println(s1.length());
            // System.out.println(s1_rev.length());

    
            if((s1.equals(s1_rev))){
                    System.out.println(s1); 
                    break;
                }
        
            a=t2;
        }
        
        

       sc.close();
        // System.out.println(t);
        // String a="444";
        // String b="444";
        // System.out.println(a==b);
    }
}
