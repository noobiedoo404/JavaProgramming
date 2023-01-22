package Searching_Algorithms.Binary_Search.Concepts;

//Iterative approach for Binary Search
public class BS_Iterative {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int[] arr = { 1 };

        int target = 1;
        System.out.println(bsIterative(arr, target));
    }

    static int bsIterative(int[] arrRef, int targetRef) {
        int start = 0;
        int end = arrRef.length - 1;
        int mid;
        if (start == end) {
            if (targetRef == arrRef[start])
                return start;
            else
                return -1;
        }
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (targetRef == arrRef[mid]) {
                return mid;
            } else if (targetRef > arrRef[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
