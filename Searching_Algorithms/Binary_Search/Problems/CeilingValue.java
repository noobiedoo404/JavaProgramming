package Searching_Algorithms.Binary_Search.Problems;

public class CeilingValue {
    public static void main(String[] args) {
        int[] arr1={2,3,5,9,14,16,18};
        // int[] arr1={2,3,6,8,11,45};
        int target=14;
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

        if(target>arr[mid])return arr[mid+1];
        else return arr[mid];
    }
}
