// https://leetcode.com/problems/palindrome-number/solution/
package Arrays.Problems;

public class Palindrome {
    public static void main(String[] args) {
        int str1=123454321;

    
        String str=Integer.toString(str1);

        // for (int i = 0; i < str.length()/2; i++) {
        //     if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
        // }
        // return true;
        if((str.equals(revstr(str))))
        System.out.println("Yes");
        else
        System.out.println("No");
    }

    static String RevString(String temp){
        String revstr="";
        for (int i = 0; i < temp.length(); i++) {
            revstr=revstr+temp.charAt(temp.length()-1-i);
        }
        System.out.println(revstr);
        return revstr;
    }

    static String revstr(String a){
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        System.out.println(b);
        return b;
    }
}