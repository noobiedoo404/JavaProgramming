package Arrays.Problems;
// import java.util.Scanner;

public class MaxItem {
    public static void main(String[] args) {
        // int[] arr=new int[6];
        // Scanner in =new Scanner(System.in);
        // for (int i = 0; i < arr.length; i++) {
        // arr[i]=in.nextInt();
        // }

        int[] arr = { 1, 44, 33, 45, 3, 5 };

        System.out.println(max(arr));
        System.out.println(MaxInRange(arr, 1, 4));
    }

    // when range is not given
    public static int max(int[] arr1) {
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (max < arr1[i]) {
                max = arr1[i];
            }
        }
        return max;
    }

    // if any range is provided i.e., start and the end is given.
    public static int MaxInRange(int[] arr1, int start, int end) {
        int max = arr1[start];
        for (int i = start; i <= end; i++) {
            if (max < arr1[i]) {
                max = arr1[i];
            }
        }
        return max;
    }
}
