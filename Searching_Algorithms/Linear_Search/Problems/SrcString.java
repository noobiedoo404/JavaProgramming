package Searching_Algorithms.Linear_Search.Problems;

import java.util.Arrays;

public class SrcString {
    public static void main(String[] args) {
        String str = "Partha";
        char target = 'b';
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(search(str, target));
    }

    // static int search(String str1,char target1){
    // for (int i = 0; i < str1.length(); i++) {
    // if(str1.charAt(i)==target1){
    // return i;
    // }

    // }
    // return -1;
    // }
    static boolean search(String str1, char target1) {
        if (str1.length() == 0) {
            return false;
        }
        //using for each loop
        for (char iterable_element : str1.toCharArray()) {
            if (iterable_element == target1) {
                return true;
            }
        }
        return false;
    }
    // static boolean search(String str1,char target1){
    // for (int i = 0; i < str1.length(); i++) {
    // if(str1.charAt(i)==target1){
    // return true;
    // }

    // }
    // return false;
    // }
}
