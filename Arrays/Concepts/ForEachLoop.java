package Arrays.Concepts;

public class ForEachLoop {
    public static void main(String[] args) {
        // ForEach loop for integer array
        int[] intArr = { 1, 2, 3, 4, 5 };
        for (int i : intArr) {
            System.out.print(i);
        }
        System.out.println();

        // ForEach loop for string array
        String[] str = { "Hi ", "this ", "is ", "Partha " };
        for (String string : str) {
            System.out.print(string);
        }

        System.out.println();
        // ForEach loop for string
        // first make the string into a character array then same rule is followed.
        String str1 = "Dishani";
        for (char string : str1.toCharArray()) {
            System.out.print(string);
        }

    }
}
