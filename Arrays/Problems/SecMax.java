//finding second max element in the array using bubble sort method

//in this case, we will be continuing two times only.
//if we continue this array.length times, we are going to get a sorted array
package Arrays.Problems;

public class SecMax {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 7, 6, 9, 12212, 3434, 4123 };
        // TimeComplexity-> 2n≈O(n) SpaceComplexity=O(1)
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap(arr[j],arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(arr[arr.length - 2]);

    }
    // static void swap(int a,int b){
    // int temp;
    // temp=a
    // }
}
