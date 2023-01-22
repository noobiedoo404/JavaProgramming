package Sorting_Algorithms.InsertionSort;
import java.util.Arrays;

public class IS {
    public static void main(String[] args) {
        int[] input_arr = { 5, 3, 4, 1, 2 };
        System.out.println(Arrays.toString(InsertionSort(input_arr)));
    }

    public static int[] InsertionSort(int[] arr) {
        for ( int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
