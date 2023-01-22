// https://leetcode.com/problems/valid-palindrome/submissions/
package Arrays.Problems;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "parap";
        System.out.println(isValid(str));
    }

    // static boolean isValid(String str){

    // String str3=str.toLowerCase();
    // String str2="";
    // for (int i = 0; i < str.length(); i++) {
    // char temp=str3.charAt(i);
    // if(temp>96 && temp< 123 || temp>47 && temp< 58 ){
    // str2+=temp;
    // }
    // }
    // String str4="";
    // for (int i = str2.length()-1; i >=0; i--) {
    // str4+=str2.charAt(i);
    // }

    // return str4.equals(str2);
    // }
    static boolean isValid(String str) {

        int i = 0;
        int j = str.length() - 1;
        String str2 = str.toLowerCase();
        while (i < j) {
            while (i != j) {
                if (alphanumeric(str2.charAt(i))) {
                    break;
                }
                i++;
            }

            while (j != i) {
                if (alphanumeric(str2.charAt(j))) {
                    break;
                }
                j--;
            }

            if (str2.charAt(i) != str2.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean alphanumeric(char a) {
        return (a > 96 && a < 123 || a > 47 && a < 58);
    }
}
