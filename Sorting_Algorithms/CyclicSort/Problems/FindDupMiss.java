package Sorting_Algorithms.CyclicSort.Problems;
import java.util.*;
public class FindDupMiss {
    public static void main(String[] args) {
        int[] inputarr={1,2,2,3};
        System.out.println(Arrays.toString(findErrorNums(inputarr)));

    }
    static int[] findErrorNums(int[] arr) {
        int i = 0;
        int correct_index = 0;
        // List<Integer> lst = new ArrayList<Integer>();
        int[] lst=new int[2];
        while (i < arr.length) {
            correct_index = arr[i] - 1;
            // jodi i and correct index ek na hoy...halka chap
            if (i != correct_index) {
                // jodi value at correct index onno hoy then swap korbo
                if (arr[i] != arr[correct_index]) {
                    // swap
                    int temp = arr[correct_index];
                    arr[correct_index] = arr[i];
                    arr[i] = temp;
                    ;
                }
                // jodi correct index e already otai thake then otai duplicate element
                else {
                    lst[0]=arr[i];
                    i++;
                }
            }
            // jodi i and correct index same hoy egiye jao,chapless..
            else {
                i++;
            }
        }
        //traverse for the elememt which is missing
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j] - 1)
                lst[1]=j+1;
        }
        return lst;
    }
}
