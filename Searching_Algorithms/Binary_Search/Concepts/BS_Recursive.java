package Searching_Algorithms.Binary_Search.Concepts;

//Binary search in RECURSIVE approach
public class BS_Recursive {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };
        int first = 0;
        int last = arr.length - 1;
        int target = 11;
        System.out.println(Binary_Search(arr, target, first, last));
    }

    static int Binary_Search(int[] temp, int target, int first, int last) {

        // int mid=(first+last)/2; //Here that addition may exceed the int range
        int mid = first + (last - first) / 2; // To avoid that exceeding issue we can have this formula

        if (target == temp[mid]) {
            return mid;
        }
        if (target > temp[mid] && first < last) {
            first = mid + 1;
            last = temp.length - 1;

            return Binary_Search(temp, target, first, last);

        }
        if (target < temp[mid] && first < last) {
            last = mid - 1;
            return Binary_Search(temp, target, first, last);
        }
        return -1;
    }

}
