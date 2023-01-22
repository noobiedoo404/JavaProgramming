// https://www.hackerrank.com/challenges/java-strings-introduction/problem
package Strings.Substrings;
import java.util.*;

public class FindSmallestAndLargest {
    public static void main(String[] args) {
        System.out.println(func("hithisisparthabhowmick",3));
    }
    static String func(String s,int k){
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String[] substrings=new String[s.length()+1-k];
        for(int i=0;i<=s.length()-k;i++){
            substrings[i]=s.substring(i,i+k);
            System.out.println(substrings[i]);
        }
        //finding the smallest substring
        smallest=substrings[0];
        largest=substrings[0];
        System.out.println(Arrays.toString(substrings));
        for (int i = 1; i < substrings.length; i++) {
            String temp=substrings[i];
            System.out.println(temp);
            if(temp.compareTo(smallest)<0){
                smallest=substrings[i];
            }
            if(temp.compareTo(largest)>0){
                largest=substrings[i];
            }
        }
        
        return smallest + "\n" + largest;
    }
}
