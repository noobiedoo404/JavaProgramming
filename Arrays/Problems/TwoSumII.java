// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
package Arrays.Problems;
import java.util.*;

public class TwoSumII {
    public static void main(String[] args) {
        int[] tempArr={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(func(tempArr,target)));
    }

    static int[] func(int[] arr, int target){
        int j=arr.length-1;
        for (int i = 0; i < j; ) {
            int sum=arr[i]+arr[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{
                return new int[]{i+1,j+1};

        }
        }
        return new int[]{-1,-1};
    }
}
