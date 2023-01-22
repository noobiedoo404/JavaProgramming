// https://leetcode.com/problems/container-with-most-water/submissions/
package Arrays.Problems;

public class MaxArea {
    public static void main(String[] args) {
        int[] tempArr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(func(tempArr));
    }

    static int func(int[] arr){
         int Max=0;
            int j=arr.length-1;
            for (int i= 0; j >i ;) {
                
                if(arr[i]>=arr[j]){
                    int tempArea=min(arr[i],arr[j])*(j-i);
                    if(tempArea>Max){
                        Max=tempArea;
                    }
                    j--;
                        
                }
                else{
                    int tempArea=min(arr[i],arr[j])*(j-i);
                    if(tempArea>Max){
                        Max=tempArea;
                    }
                    i++;
                }
            }
            return Max;
        }


    static int min(int a, int b){
            if(a>b)return b;
            return a;
    }
}
