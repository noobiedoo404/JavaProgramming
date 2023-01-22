package Arrays.Problems;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(methRev2(arr)));
    }

    // method I for reversing the array
    static int[] methRev(int[] testArr) {
        int temp;
        // two pointer method
        // TimeComplexity-O(n) SpaceComplexity=O(1)
        for (int i = 0, j = testArr.length - 1; i < j; i++, j--) {
            temp = testArr[i];
            testArr[i] = testArr[j];
            testArr[j] = temp;
        }
        return testArr;
    }

    // method II for reversing the array
    static int[] methRev2(int[] testArr) {
        int j = 0;
        // condition here is different than the previous one
        for (int i = testArr.length - 1; i > (testArr.length - 1) / 2; i--) {
            int temp = testArr[j];
            testArr[j] = testArr[i];
            testArr[i] = temp;
            j++;
        }

        return testArr;
    }
}
