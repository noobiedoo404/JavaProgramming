package Searching_Algorithms.Binary_Search.Problems;
import java.util.*;

public class FirstLastPos {
    public static void main(String[] args) {
        // int[] arr={5,7,7,8,8,9};
        int[] arr={1,4};
        int target=4;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }

    static int[] searchRange(int[] nums, int target) {
        if(nums.length==0)return new int[]{-1,-1};
        int findex=-1;
        if(nums[0]==target){
            findex=0;
        }
        else{
            int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+((e-s)/2);
            
            if(nums[mid]==target && nums[mid-1]<target){
                findex=mid;
                break;
            }
            else if(nums[mid]>=target)e=mid-1;
            
            else {s=mid+1;}
        }
        }
        
        
        int lindex=-1;
        if(nums[nums.length-1]==target)lindex=nums.length-1;
        //for finding last index
        else{
            int s=0;
            int e=nums.length-1;
        while(s<=e){
            int mid=s+((e-s)/2);
            if(nums[mid]==target && nums[mid+1]>target){
                lindex=mid;  
                break;
            }
            else if(nums[mid]<=target)s=mid+1;
            
            else {e=mid-1;}
        }
        // if(findex>=0){return new int[]{findex,lindex};
        
        
                     }
        // String s="dfdsf";
        // s.equals(anObject)
        // if(s.charAt(1)==(s.charAt(2))){return 1;}
        return new int[]{findex,lindex};
        
        
    } 
}
