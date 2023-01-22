package Sorting_Algorithms.MergeSort;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr={2, 3, 5, 6, 1};
        // int[] arr1={6};
        // int[] arr2={1};
        System.out.println(Arrays.toString(MergeSort(arr)));
        // System.out.println(Arrays.toString(merge(arr1,arr2)));
    }

    static int[] MergeSort(int[] arr){
         if(arr.length==1){
            return arr;
         }
         int mid=arr.length/2;
        //  System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0,mid)));
         int[] left=MergeSort(Arrays.copyOfRange(arr, 0,mid));
        //  System.out.println(Arrays.toString(Arrays.copyOfRange(arr, mid, arr.length)));
         int[] right=MergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }

    static int[] merge(int[] first,int[] second){
        int[] merged=new int[first.length+second.length];
        int k=0,j=0;
        int i=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                merged[k]=first[i];
                i++;             
            }
            else{
                merged[k]=second[j];
                j++;
            }
            k++;
        }

        if(i==first.length){
            while(j<second.length){
                merged[k]=second[j];
                k++;
                j++;
            }
        }
        else{
            while(i<first.length){
                merged[k]=first[i];
                k++;
                i++;
            }
        }
        // System.out.println(Arrays.toString(merged));
        return merged;
    }
}
