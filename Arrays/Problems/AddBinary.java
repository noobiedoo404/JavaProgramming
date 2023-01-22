// https://leetcode.com/problems/add-binary/
package Arrays.Problems;

// import java.util.*;
public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(func(a, b));
    }

    static String func(String a, String b) {
        int diff = b.length() - a.length();
        if (diff > 0) {
            for (int i = 0; i < diff; i++) {
                a = "0" + a;
            }
        } else {
            for (int i = 0; i < (-1 * diff); i++) {
                b = "0" + b;
            }
        }

        int carry = 0;
        String res = "";
        for (int i = a.length()-1; i >=0 ; i--) {
            if (a.charAt(i)-b.charAt(i)==0) {
                res =  (char)(carry + 48) + res;
                carry = a.charAt(i) - 48;
            } else {
                res = (char)(1 - carry + 48) + res;
            }
        }

        if (carry == 1) {
            return "1" + res;
        }
        return res;

    }
}
