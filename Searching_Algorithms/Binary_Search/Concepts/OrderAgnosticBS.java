package Searching_Algorithms.Binary_Search.Concepts;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };
        int[] arr = { 10,9,8,7,6,5,5,4,3,2,1,0};
        int start = 0;
        int end = arr.length-1;
        int target=5;
        System.out.println( OrderAgnosticBinarySearch(arr, start, end,target));
    }

    static int OrderAgnosticBinarySearch(int[] arrRef, int start, int end, int target) {
        int mid=start+(end-start)/2;
        if (arrRef[0]>arrRef[arrRef.length-1]){
            if(target==arrRef[mid])return mid;
            if(target>arrRef[mid] && start<end){
                end=mid-1;
                return OrderAgnosticBinarySearch(arrRef, start, end, target);
            }
            if(target<arrRef[mid] && start<end){
                start=mid+1;
                return OrderAgnosticBinarySearch(arrRef, start, end, target);
            }
        }
        else{
            if(target==arrRef[mid])return mid;
            if(target<arrRef[mid] && start<end){
                end=mid-1;
                return OrderAgnosticBinarySearch(arrRef, start, end, target);
            }
            if(target>arrRef[mid] && start<end){
                start=mid+1;
                return OrderAgnosticBinarySearch(arrRef, start, end, target);
            }
        }
        return -1;
    }


    //can be done in iterative way also. :) and yes thats gonna reduce some line of codes .lol.

}
