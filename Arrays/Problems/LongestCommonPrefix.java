
// https://www.youtube.com/watch?v=bl8ue-dTxgs
// https://leetcode.com/problems/longest-common-prefix/

package Arrays.Problems;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "a" };
        // String[] strs = {"flower","flow","flight"};
        System.out.println(CommonPrefix(strs));
    }

    static String CommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        return prefix;

    }


// INEFFICIENT APPROACH :)

    // static String CommonPrefix(String[] strs) {
    //     int min = strs[0].length();

    //     if (min == 1) {
    //         return strs[0];
    //     }
    //     for (int i = 0; i < strs.length; i++) {
    //         if (strs[i].length() < min) {
    //             min = strs[i].length();
    //         }
    //     }
    //     int m = 0, j = 0;
    //     String str = "";
    //     while (m < min) {
    //         int i = 0;
    //         while (i < strs.length - 1 && strs[i].charAt(j) == (strs[i + 1].charAt(j))) {
    //             i++;
    //         }
    //         if (i == strs.length - 1) {
    //             str += strs[i - 1].charAt(j);
    //         } else {
    //             return str;
    //         }

    //         m++;
    //         j++;
    //     }
    //     return str;
    // }

    

}
