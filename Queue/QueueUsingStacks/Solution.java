package Queue.QueueUsingStacks;
import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Stack<Integer> stack1=new Stack<Integer>();
        Stack<Integer> stack2=new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            String query=in.nextLine();
            // System.out.println(query);
            if(query.charAt(0)=='1'){
                String[] arr=query.split(" ");
                // System.out.println(arr[1]);
                if(stack1.isEmpty() && !stack2.isEmpty()){
//                    for(int j=0;j<stack2.size();j++){
//                        stack1.push(stack2.pop());
//                    }
                    while(!stack2.isEmpty())stack1.push(stack2.pop());
                }
                // System.out.println(stack2.size());
                System.out.println("pushing "+Integer.parseInt(arr[1]));
                stack1.push(Integer.parseInt(arr[1]));
            }
            else{
                if(stack2.isEmpty()){
//                    System.out.println("stack 2 size is"+stack2.size());
                    System.out.println("stack 1 size is"+stack1.size());

                    while(!stack1.isEmpty())stack2.push(stack1.pop());
                    System.out.println("stack 2 size is "+stack2.size());
                    System.out.println("stack 2 is");
                    System.out.println(stack2);
                }
                if(query.charAt(0)=='2'){
                    System.out.println("popping out" +stack2.pop());
                    // stack2.pop();
                }
                else{
                    System.out.println("peeking");
                    System.out.println(stack2.peek());
                }
            }

        }
    }
}
