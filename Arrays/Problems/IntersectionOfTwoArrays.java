package Arrays.Problems;

import java.util.ArrayList;
import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 3, 4 };
        int[] arr2 = { 2, 3, 5 };

        System.out.println(Intersection(arr1, arr2));
    }

    static ArrayList<Integer> Intersection(int[] a, int[] b) {
        ArrayList<Integer> list1 = new ArrayList<>(b.length);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        int a_length = 0;
        for (int j = 1; j < a.length; j++) {
            if (a[a_length] != a[j]) {
                a_length++;
                a[a_length] = a[j];
            }
        }
        a_length+=1;
        System.out.println(Arrays.toString(a) + a_length);

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length - 1; j++) {
                if (b[j] > b[j + 1]) {
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }

        int b_length = 0;
        for (int j = 1; j < b.length; j++) {
            if (b[b_length] != b[j]) {
                b_length++;
                b[b_length] = b[j];
            }
        }
        b_length+=1;
        System.out.println(Arrays.toString(b) + b_length);

        ArrayList<Integer> list = new ArrayList<>(b.length);
        for (int i = 0; i < a_length; i++) {
            for (int j = 0; j < b_length; j++) {
                if (a[i] == b[j]) {
                    list.add(b[i]);
                    break;
                }
            }
        }
        return list;

        // else{

        // ArrayList<Integer> list = new ArrayList<>(a.length);
        // for (int i = 0; i < a_length; i++) {
        // for (int j = 0; j < a_length; j++) {
        // if(a[i]==b[j] ){
        // list.add(a[i]);
        // break;}

        // }
        // }
        // return list;
        // }
        // return list1;
    }
}
