// https://leetcode.com/problems/find-the-duplicate-number/submissions/
package Sorting_Algorithms.CyclicSort.Problems;

import java.util.*;

public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] inputarr = { 1,1 };
        // System.out.println(FindDup(inputarr));
        System.out.println(findDuplicates(inputarr));
        

    }

    // static int FindDup(int[] arr) {
    // int i = 0;
    // int correct_index = 0;
    // while (i < arr.length) {
    // correct_index = arr[i] - 1;
    // //jodi i and correct index ek na hoy...halka chap
    // if (i != correct_index) {
    // //jodi value at correct index onno hoy then swap korbo
    // if (arr[i] != arr[correct_index]) {
    // // swap
    // int temp = arr[correct_index];
    // arr[correct_index] = arr[i];
    // arr[i] = temp;;
    // }
    // //jodi correct index e already otai thake then otai answer
    // else {
    // return arr[i];
    // }
    // }
    // //jodi i and correct index same hoy egiye jao,chapless..
    // else{
    // i++;
    // }
    // }
    // return -1;
    // }

    static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        int correct_index = 0;
        while (i < arr.length) {
            correct_index = arr[i] - 1;
            // jodi i and correct index ek na hoy...halka chap

            // jodi value at correct index onno hoy then swap korbo
            if ( i != correct_index && arr[i] != arr[correct_index])  {
                // swap
                int temp = arr[correct_index];
                arr[correct_index] = arr[i];
                arr[i] = temp;
                ;
            }
            // jodi correct index e already otai thake then otai answer
            else {
                // return arr[i];
                i++;
            }
        }
        // jodi i and correct index same hoy egiye jao,chapless..

        // System.out.println(Arrays.toString(arr));

        List<Integer> lst = new ArrayList<Integer>();
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j] - 1)
                lst.add(arr[j]);
        }
        return lst;
    }

}
