// https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/
package Searching_Algorithms.Binary_Search.Problems;

public class NextGreatestChar {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(func(letters,target));
    }

static char func(char[] arr, char target){
    int start=0,end=arr.length-1;
    // int mid=arr.length/2;

    while(start<=end){
        int mid=start+(end-start)/2;
        if(target<arr[mid]){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    

    
    // return -1;
    return arr[start%arr.length];
}
}
