package Arrays.Problems;
import java.util.*;;

public class NQT {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        float [] arr=new float[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextFloat();
        }
        String str=sc.next();
        System.out.println(str);
        System.out.println(Arrays.toString(func(arr)));
        sc.close();
    }
    static float[] func(float[] nums){
        int j=nums.length-1;
        for (int i = 0; i < j;) {
            if(nums[i]==0){
                if(nums[j]!=0f){
                    float temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;       
                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
        }
        return nums;
    }
}
