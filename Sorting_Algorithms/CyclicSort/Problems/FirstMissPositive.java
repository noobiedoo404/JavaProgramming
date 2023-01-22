package Sorting_Algorithms.CyclicSort.Problems;

public class FirstMissPositive {
    public static void main(String[] args) {
        int[] inputarr = { 1, 1 };
        System.out.println(FindMissPos(inputarr));
    }

    public static int FindMissPos(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if (i != correct_index && arr[i] > 0 && arr[i] < arr.length) {
                // swap
                if (arr[i] != arr[correct_index]) {
                    int temp = arr[correct_index];
                    arr[correct_index] = arr[i];
                    arr[i] = temp;
                }

                else {
                    i++;
                }
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j] - 1)
                return j + 1;
        }
        return arr.length + 1;
    }
}
