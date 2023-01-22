// https://leetcode.com/problems/richest-customer-wealth/submissions/
package Searching_Algorithms.Linear_Search.Problems;

public class MaxSum {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {2,1,4},
            {5,4,3}
        };
        int sum,max=0;
        for (int i = 0; i < arr.length; i++) {
            sum=arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
            }
            if(i==0){
                max=sum;
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
