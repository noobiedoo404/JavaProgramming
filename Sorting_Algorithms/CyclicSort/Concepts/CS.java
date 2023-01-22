package Sorting_Algorithms.CyclicSort.Concepts;
import java.util.Arrays;
//when we are given numbers from range 1,N : then we use cyclic sort
//Here we have to see whether the element is at correct index or not
//for example, for the number 3, the correct index is (3-1)=2,so 3 must be at index 2.
//So we must swap 3 with the element at index 2 if its not already there. 
//And we must keep swapping until every element is at its correct index.

//Time complexity is O(n).
public class CS {
    public static void main(String[] args) {
        int[] input_arr={6,3,4,2,5,1};
        System.out.println(Arrays.toString(CyclicSort(input_arr)));
    }
    
    
    static int[] CyclicSort(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int correct_index=arr[i]-1;
            //i jodi value tar correct index na hoy then swap korbo
            if(i!=correct_index){
                //swap
                int temp=arr[correct_index];
                arr[correct_index]=arr[i];
                arr[i]=temp;
            }
            else{
                
                i++;
            }
        }
        return arr;    
    }
}
