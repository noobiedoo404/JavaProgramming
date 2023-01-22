package Arrays.Problems;
import java.util.Arrays;

public class FindMedian {
    public static void main(String[] args) {
        int[] a={6};
        int[] b={1,2,3,4,5,7};
        System.out.println(mean(a,b));
    }
    static double mean(int[] nums1, int[] nums2){
        double[] jointArr=new double[nums1.length+nums2.length];
        // System.out.println(jointArr.length);
        
        if(nums1.length==0){
              if(nums2.length%2==0){
                        return (nums2[nums2.length/2]+nums2[nums2.length/2-1])/2.0;
                    }
                    return nums2[nums2.length/2];
        }
        if(nums2.length==0){
              if(nums1.length%2==0){
                        return nums1[nums1.length/2]+nums1[nums1.length/2-1]/2;
                    }
                    return nums1[nums1.length/2];
        }
        int j=0;
        int k=0;
        for(int i=0;k<jointArr.length;){
            if(nums1[i]<=nums2[j]){
                jointArr[k]=nums1[i];
                i++;
                k++;
                if(i==nums1.length){
                    for (int l = j; l < nums2.length; l++) {
                        jointArr[k]=nums2[l];
                        k++;
                    }
                    // System.out.println(Arrays.toString(jointArr));
                    if(jointArr.length%2==0){
                        return (jointArr[jointArr.length/2]+jointArr[jointArr.length/2-1])/2;
                    }
                    return jointArr[jointArr.length/2];
                }
            }
            else {
                jointArr[k]=nums2[j];
                j++;
                k++;
                if(j==nums2.length){
                    for (int l = i; l < nums1.length; l++) {
                        jointArr[k]=nums1[l];
                        k++;
                    }
                    System.out.println(Arrays.toString(jointArr));
                    if(jointArr.length%2==0){
                        return jointArr[jointArr.length/2]+jointArr[jointArr.length/2-1]/2;
                    }
                    return jointArr[jointArr.length/2];
                }                
            }
        }
      return -1;
       
    }


}
