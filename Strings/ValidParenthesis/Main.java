package Strings.ValidParenthesis;

public class Main {
    public static void main(String[] args) {
        System.out.println(meth("()[]{}"));
    }

    static boolean meth(String s){
        for(int i=0;i<s.length()-1;i+=2){
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            if(a=='(' && b!=')')return false;
            else if(a=='[' && b!=']')return false;
            else if(a=='{' && b!='}')return false;
            // if(Character.compare(x, y))return false;
            // System.out.println(s.charAt(i));
            // System.out.println(s.charAt(i+1));
            // System.out.println(i);
        }
        return true;
    }
}
