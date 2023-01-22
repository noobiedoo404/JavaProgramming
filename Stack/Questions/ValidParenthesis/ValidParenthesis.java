// https://leetcode.com/problems/valid-parentheses/submissions/
//https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=false

package Stack.Questions.ValidParenthesis;

import java.io.*;
import java.util.*;

public class ValidParenthesis {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            int counter = input.length();
            int i = 0;
            Stack<Character> stack = new Stack<>();
            while (counter > 0) {
                char symbol = input.charAt(i);
                if (symbol == '(' || symbol == '{' || symbol == '[') {
                    stack.push(symbol);
                    i++;
                    counter--;
                }
                else {
                    if (stack.empty()) {
                        break;
                    }

                    char openBrac = stack.pop();
                    if (
                            (symbol == ']' && openBrac == '[') || (symbol == '}' && openBrac == '{') || (symbol == ')' && openBrac == '(')) {
                                 counter--;
                                 i++;
                    }
                    else {
                        break;
                    }

                }


            }
            System.out.println(stack.empty() && counter == 0);

        }
        sc.close();

    }
}
