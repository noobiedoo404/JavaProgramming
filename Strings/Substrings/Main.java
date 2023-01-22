//finding all the patterns in the string

package Strings.Substrings;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=' '){
                b+=a.charAt(i);
            }
        }
        String c =sc.next();
        for(int i=0;i<b.length()-1;i++){
            for (int j = i; j < b.length(); j++) {
                // System.out.println(b.substring(i,j+1));
                if(b.substring(i,j+1).matches(c)){
                    System.out.println("found it!");
                    break;
                }
            }
        }
        sc.close();
    }
    
}
