// https://leetcode.com/problems/missing-number/submissions/
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/

package Sorting_Algorithms.CyclicSort.Problems;

import java.util.*;

// import java.util.List;
// import java.util.Arrays;

public class FindMissingElement {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        
        // System.out.println(Arrays.toString(FMES(arr)));
        System.out.println(FMES(arr));
    }

    /* Un-optimized "FIND MISSING ELEMENT" function */
    // static int FME(int[] arr) {
    // int[] arr2=new int[arr.length+1];
    // for (int i = 0; i < arr2.length; i++) {
    // arr2[i]=-1;
    // }
    // for (int i = 0; i < arr.length; i++) {
    // int correct_index=arr[i];
    // arr2[correct_index]=arr[i];
    // }
    // for (int i = 0; i < arr2.length; i++) {
    // if(arr2[i] == -1){
    // return i;
    // }
    // }
    // return 0;
    // }



    // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/
    /*
    function to find all the numbers disappeared in the array using cyclic sort
     */
    static List<Integer> FMES(int[] arr) {

        int i=0;
        while(i<arr.length){
            int correct_index=arr[i]-1;
            if(i != correct_index && arr[correct_index]!=arr[i]){
                //swap
                int temp=arr[correct_index];
                arr[correct_index]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }

        List<Integer> lst=new ArrayList<Integer>();
        for (int j = 0; j < arr.length; j++){
            if(arr[j] !=j+1 ){
                lst.add(j+1);
            }    
        }
        return lst;

    }

    // https://leetcode.com/problems/missing-number/submissions/
    /******
     * function to find the number disappeared in the array using cyclic sort
     ******/

    static int FME(int[] arr) {
       int i=0;
        while (i < arr.length) {
            int correct_index = arr[i];
            if (i != correct_index && correct_index!=arr.length) {
                // swap
                int temp = arr[correct_index];
                arr[correct_index] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }

        // if(arr[arr.length-1] ==arr.length-1){
        // return arr.length;
        // }

        // Dont need to write that,we can directly write return which will run if the
        // above condition is never satisfied
        return arr.length;

    }
}
