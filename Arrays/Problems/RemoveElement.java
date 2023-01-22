// https://leetcode.com/problems/remove-element/
package Arrays.Problems;
// import java.util.*;
public class RemoveElement {
    public static void main(String[] args) {
        int[] inputarr={0,1,2,2,3,0,4,2};
        int item=2;
        // System.out.println(Arrays.toString(RemoveItem(inputarr,item)));
        System.out.println(RemoveItem(inputarr, item));
    }

    // static int[] RemoveItem(int[] arr ,int item){
    //     int count1=0;
    //     int count2=0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr[i]==item){
    //             count1++;
    //         }
    //     }
    //     for (int i = 0; i < arr.length; ) {
    //         if(arr[i]==item ){
    //             int temp;
    //             for (int j = i; j < arr.length-1; j++) {
    //                 temp=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp; 
    //                 // System.out.println(Arrays.toString(arr));
    //             }
    //             count2++;
    //             if(count2==count1){
    //                 for (int j = 0; j < count1; j++) {
    //                     arr[arr.length-1-j]=-1;
    //                 }
    //                 return arr;
    //             }
    //         }
    //         if(arr[i]!=item){
    //             i++;
    //         }
            
    //     }
    //     return arr;
    // }
    static int RemoveItem(int[]arr ,int item){
        int i=0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=item) {
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
    }
}
