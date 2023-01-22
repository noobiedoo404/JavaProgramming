package _50_InterviewQuestions.Q4_CheckPrimeOrNot;

public class Main {
    public static void main(String [] args){
        System.out.println(check(37));
        // System.out.println((int)Math.sqrt(25));
    }

    static boolean check(int a){
        if(a<2){
            return false;
        }
        if(a==2)return true;
        // int j=1;
        for (int i = 2; i <= (int)Math.sqrt(a); i++) {
            if(a%i==0){
                return false;
            }
            // System.out.println(j);
            // j++;
        }
        return true;
    }
}
