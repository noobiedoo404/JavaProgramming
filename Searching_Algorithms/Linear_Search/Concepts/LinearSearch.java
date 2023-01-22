package Searching_Algorithms.Linear_Search.Concepts;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66};
        int target=444;
        System.out.println(search(arr,target));
        }
    

    static int search(int[] temp,int target){
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]==target){
                return i;
            }
        }
        return -1;
    }
}
