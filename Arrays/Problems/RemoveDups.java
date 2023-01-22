// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/submissions/
package Arrays.Problems;

import java.util.*;

public class RemoveDups {
    public static void main(String[] args) {
        int[] nums = { 0,0,1,1,1,1,2,3,3 };
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {

        // One edge case is there that if the numsay is empty return 0
        if (nums.length == 0)
            return 0;
        int i = 0;
        int count = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[i] && count < 2) {
                i++;
                count++;
                nums[i] = nums[j];

            } else if (nums[j] != nums[i]) {
                i++;
                count = 1;
                nums[i] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));
        return ++i;
    }
}
