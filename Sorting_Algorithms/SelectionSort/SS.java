package Sorting_Algorithms.SelectionSort;

import java.util.Arrays;

//Selection sort means selecting an element and putting it to its right index.
public class SS {
    public static void main(String[] args) {
        int[] input_arr = { 3, 5, 4, 1, 2 };
        System.out.println(Arrays.toString(SelectionSort(input_arr)));

    }

    static int[] SelectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            int swapper_index = -1;
            // here finding the max element and swapping with the correct index
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    swapper_index = j;
                }
            }
            // swap
            arr[swapper_index] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = max;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    // we can apply selection sort by finding minimum elememt and then swap that
    // value with the correct index as well.

}
