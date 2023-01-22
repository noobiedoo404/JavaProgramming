package Strings.MixedQuestions;

public class Test1 {
   
    public static void main(String[] args) {

      Solution g=new Solution();
      int n=4,k=0;
      int[] arr={1,2,3,4,5};
      System.out.println(g.binarysearch(arr, n, k));


    //     int j=0,k=0;
    //     int [] a={3,2,6,5,1,4,8,9};
    //     int[] a1=new int[10];
    //     int[] a2=new int[10];
    //     for(int i=0;i<a.length;i++){
    //         if(a[i]!=5){
    //             a1[j]+=a[i];
    //             j++;        
    //         }
    //         if (a[i]==5){
    //             while(true){
    //                 a2[k]+=a[i];
    //                 k++;
    //                 if(a[i]==8){
    //                     break;
    //                 }
    //                 i++;
                    

    //             }
    //         }
    //         }
    //     int sum1=0,sum2=0,number2=0,l=1;
    //     for(int i=0;i<j;i++){
    //         sum1+=a1[i];
    //     }
    //     for(int i=k-1;i>=0;i--){
    //         number2=((l*a2[i])+number2);
    //         l*=10;
    //     }
    //     System.out.println(sum1+number2);


    
    }
}
class Solution {
    static int l=0;
    int binarysearch(int arr[], int n, int k){
        int mid=((l+n)/2);
        while(l<=n){
            if (arr[mid]==k){
                return mid;// code here
            }
            if(arr[mid]<k){
                l=mid+1;
                // System.out.println(l);
                return binarysearch( arr, n, k);
            }
            if(arr[mid]>k){
                n=mid-1;
                return binarysearch(arr, n, k);
            }
        }
        
     return -1;   
}
    
}