//https://leetcode.com/problems/two-sum/submissions/
package Arrays.Problems;
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] inputarr={0,4,3,0};
        int target=0;
//        System.out.println(Arrays.toString(twosum(inputarr,target)));
        System.out.println(Arrays.toString(getIndices(inputarr,target)));
    }

    // static int[] twosum(int[] arr,int target){
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 1; j < arr.length; j++) {

    //             if(arr[i]+arr[j]==target && i!=j){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }


    // static int[] twosum(int[] arr,int target){
    //     for (int i =arr.length-1; i >= 0; i--) {
    //         for (int j = 0; j < i; j++) {

    //             if(arr[i]+arr[j]==target){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }


    static int[] twosum(int[] arr,int target){

        Arrays.sort(arr);
        // ArrayList<Integer> arr2 
            // = new ArrayList<Integer>(); 
        // int arr2[] =new int[arr.length];
        // int j=0;


        for (int i = 0; i < arr.length; i++) {
            // int dif=
        }
        int j=0;
        for (int i =1; i >arr.length; i++) {
            if(arr[i]+arr[j]==target){
                return new int[] {i,j};
                
            }
            j++;
        }
        // System.out.println(arr2);
        
        // for (int i =arr2.size()-1; i >= 0; i--) {
        //             for (int j = 0; j < i; j++) {
        //                 if(arr2.get(i)+arr2.get(j)==target){
        //                     return new int[]{i,j};
        //                 }
        //             }
        //         }

        // // for (int i =arr2.size()-1; i >j; i--) {
        // //         if(arr2.get(i)+arr2.get(j)==target){
        // //             return new int[]{i,j};
        // //         }
        // //         j++;
        // //     }
        return new int[]{-1,-1};
    }

    static int[] getIndices(int[] nums,int target){
        int[] ans={0,0};
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                int first=nums[i];
                int sec=target-first;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==sec){
                        ans[0]=i;
                        ans[1]=j;
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}
