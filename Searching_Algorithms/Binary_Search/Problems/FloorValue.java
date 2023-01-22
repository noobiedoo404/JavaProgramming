package Searching_Algorithms.Binary_Search.Problems;

public class FloorValue {
    public static void main(String[] args) {
        int[] arr1={5,5,5,6,7};
        // int[] arr1={2,3,6,8,11,45};
        int target=7;
        int s=0;
        int e=arr1.length-1;
        System.out.println(func(arr1,target,s,e));
    }

    static int func(int[] arr, int target , int start, int end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }

        if(target<arr[mid] && end!=start){
            return func(arr,target,start,mid-1);
        }

        if(target>arr[mid] && end!=start){
            return func(arr,target,mid+1,end);
        }
        
        // return -1;

        if(target>arr[mid])return arr[mid];
        else return arr[mid-1];
    }
}
