package Arrays.Concepts;

import java.util.ArrayList;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(3);
        // list.add(2);
        // list.add(3);
        // list.add(24);
        // list.add(52);

        // System.out.println(list.contains(2));
        // System.out.println(list.contains(33));

        // System.out.println(list);

        // list.set(1,5);
        // System.out.println(list);
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(list.get(i));

        }
        in.close();
    }

}
