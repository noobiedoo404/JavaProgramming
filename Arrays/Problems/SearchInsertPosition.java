// https://leetcode.com/problems/search-insert-position/submissions/
package Arrays.Problems;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int val=3;
        System.out.println(FindPos(arr,val));
    }
    static int FindPos(int[] nums,int value){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=value){
                return i;
            }
        
        }
        return nums.length;
    }
}
