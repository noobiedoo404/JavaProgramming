package _50_InterviewQuestions.Q3_VowelPresesntOrNot;

public class Main {
    public static void main(String[] args) {
        String a="abcde";
        System.out.println(check(a));
    }

    static boolean check(String str){
        for (int i = 0; i < str.length(); i++) {
            char a=str.toLowerCase().charAt(i);
            if(a=='a'|| a=='e'|| a=='i' || a=='o' || a=='u'){
                return true;
            }
        }
        return false;

    }
}
