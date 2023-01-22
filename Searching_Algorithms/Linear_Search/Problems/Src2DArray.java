package Searching_Algorithms.Linear_Search.Problems;
// import java.util.Arrays;

public class Src2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {2, 32, 46, 54, 60},
            {5, 6, 7, 8},
            {9,10,11,12,13}

        };
        // int target=12;
        // System.out.println(Arrays.toString(search_target(arr,target)));
        
        System.out.println(search_max(arr));
    }

//  *********method for searching a maximum value in 2D array************    //
    static int search_max(int [][] arr){

        int max=Integer.MIN_VALUE;
        //using enhanced for loop
        for (int[] row : arr) {
            for (int col : row) {
                if (col>max) {
                    max=col;
                }
            }
        }
        // int max=arr[0][0];
        // for ( int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         if(arr[i][j]>max){
        //             max=arr[i][j];
        //         }
        //     }
        // }
        return max;
        
    }

    //  *********method for searching a target in 2D array************    //
    // static int[] search_target(int [][] arr,int target1){
    //     for (int row = 0; row < arr.length; row++) {
    //         for (int col = 0; col < arr[row].length; col++) {
    //             if (target1==arr[row][col]) {
    //                 return new int[]{row,col};
    //             }
    //         }
    //     }
    //     return new int[]{-1, -1};
    // }
}
