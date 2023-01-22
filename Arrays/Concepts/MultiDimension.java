package Arrays.Concepts;



import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        // System.out.println(Arrays.toString(arr));
        int [][]arr2=new int [3][3];
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col]=in.nextInt();
            }
        }
        // for (int row = 0; row < arr2.length; row++) {
        //     for (int col = 0; col < arr2[row].length; col++) {
        //        System.out.print(arr2[row][col]+ " ");
        
        //     }
        //     System.out.println();
        // }
        
        // for (int row = 0; row < arr2.length; row++) {
        //     System.out.println(Arrays.toString(arr2[row]));
        // }

        for (int[] is : arr2) {
            System.out.println(Arrays.toString(is));
            
        }


        in.close();

    }
}

