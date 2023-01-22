package Sorting_Algorithms.BubbleSort.Concepts;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={4,2,1,3,5};
        System.out.println("After complete BubbleSort: " +Arrays.toString(BubbleSorted(arr)));
    }

    //This is called inplace sorting techinque because no extra space is getting used.
    //Also called stable sorting as the order of individual elements does not change.
    static int[] BubbleSorted(int[] temp){
        int temp2;
        boolean swapped; //introducing this variable to stop swapping if the array is sorted already
        for (int i = 0; i < temp.length; i++) {
            swapped=false;
        //As the last elements are getting sorted in every iteration so can reduce by 1 everytime 
            for (int j = 0; j <temp.length-1-i; j++) {
            //swap
            if(temp[j]>temp[j+1]){
                    temp2=temp[j];
                    temp[j]=temp[j+1];
                    temp[j+1]=temp2;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
            System.out.println("After iteration "+(i+1)+": "+Arrays.toString(temp));
        }
        return temp;
    }
}
