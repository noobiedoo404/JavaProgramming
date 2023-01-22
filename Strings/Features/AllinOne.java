package Strings.Features;
//import java.util.Arrays;
import java.util.*;


public class AllinOne {
    public static void main(String[] args) {
        String a= "parthaa";

        Integer[] b={1,2,3,4};
        Character[] c={'a'};
        System.out.println(Arrays.toString(c));
//        System.out.println(Arrays.toString(tocharArray(a)));
//        System.out.println((tocharArray(a).getClass()));

//        char[] JavaCharArray = {'a', 'b', 'c', 'd', 'e'};
//        int[] JavaIntArray = {1,2,3,4,5};
//        System.out.println(JavaCharArray);
//        System.out.println(JavaIntArray);

//        System.out.println(Arrays.toString(getStringArray(a,3)));
//        System.out.println(Arrays.toString(getStringArray(a,4)));
//        System.out.println(Arrays.toString(getStringArray(a,0)));
//        System.out.println(Arrays.toString(getStringArray(a,-2)));
//        System.out.println(Arrays.toString(getStringArray(a)));

        //string to integer
        String str="123";
        int value=Integer.parseInt(str);
        System.out.println(((Object)value).getClass().getSimpleName());
    }
    static String[] getStringArray(String str,int limit){
        return str.split("a",limit);
    }
    static String[] getStringArray(String str){
        return str.split("a");
    }
    static char[] tocharArray(String str){
        char[] ch= str.toCharArray();
        return ch;
    }

}
