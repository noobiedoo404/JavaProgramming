package Arrays.Concepts;

import java.util.Arrays;

public class PassingiInMethods {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(arr));
        // Depending on whether a parameter is used in the method definition or the
        // method call, it is called a formal/dummy parameter or actual
        // parameter/argument. The formal parameter is a simple identifier, the name,
        // and the actual parameter the value (of the same type as the identifier).

        // When a parameter is passed to a method ,it is called an argument.So, from the
        // example below: num is parameter and arr is the argument.
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void change(int[] num) {
        num[2] = 32;
    }
}
