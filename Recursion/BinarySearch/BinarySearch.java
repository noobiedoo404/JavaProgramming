package Recursion.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] testarr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };
        int s = 0;
        int e = testarr.length - 1;
        int t = 7;
        System.out.println(bs(testarr, t, s, e));
    }

    static int bs(int[] arr, int target, int start, int end) {

        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[mid] < target) {
            return bs(arr, target, mid + 1, end);
        }

        return bs(arr, target, start, mid - 1);

    }
}
