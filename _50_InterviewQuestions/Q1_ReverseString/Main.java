package _50_InterviewQuestions.Q1_ReverseString;

public class Main {
    public static void main(String[] args) {
        System.out.println(revStr("abcdef"));
    }

    static String revStr(String a){
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
        }

        return b;
    }
}
