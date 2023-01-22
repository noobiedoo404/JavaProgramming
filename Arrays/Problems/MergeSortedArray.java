package Arrays.Problems;
import java.util.*;

public class MergeSortedArray {
    public static void main(String[] args) {
        // int[] nums1={2,0};
        // int[] nums1={1,2,3,0,0,0};
        int[] nums1={0,0,0,0,0,0};
        // int[] nums2={1};
        // int[] nums2={2,5,6};
        int[] nums2={1,2,3,4,5,6};
        Merge(nums1, 0, nums2, 6);
        // Merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    static void Merge(int[] nums1, int m, int[] nums2, int n){
        int j=0;
        if(m==0){
            for (int i = 0; i < nums2.length; i++) {
                nums1[i]=nums2[i];
            }
            return;
        }
        if(n==0){
            return;
        }



        for(int i=0;i<nums1.length;){
            if(nums2.length-1-j==nums1.length-i-1){
    
                for (int k = i; k < nums1.length; k++) {
                    nums1[k]=nums2[j];
                    System.out.println(Arrays.toString(nums1));

                    j++;
                }
                return;
            }
            else if(nums1[i]<=nums2[j]){
                i++;

            }
           
            else {
                
                for(int x=nums1.length-1;x>i;x--){
                int temp=nums1[x-1];
                nums1[x-1]=nums1[x];
                nums1[x]=temp;
                System.out.println(Arrays.toString(nums1));
            }
            // int temp=nums1[i];
            nums1[i]=nums2[j];
            // nums1[j]=temp;
            j++;
            i++;
            if(j==nums2.length){
                return;
            }
        
        }
        

        System.out.println(Arrays.toString(nums1));
    }
}
}