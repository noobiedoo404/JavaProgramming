package Arrays.Concepts;

import java.util.Arrays;

public class ArrPrac {

    public static void main(String[] args) {
        // 1.array objects are in heap
        // 2.heap objects are not continuous
        // 3.Dynamic Memory Allocation
        // 4.Allocation is not continuous--> Depends upon JVM
        // 5.(Though definitions of Array says --
        // Its the allocation of similar datatype in contiguous memory address )
        // new is used to create an object
        // primitives are stored in stack memory and objects are stored in heap
        int[] arr; // declaration
        arr = new int[4];
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[3]);

        String[] arr2 = new String[4];
        System.out.println(arr2[3]); // output is null
        // null is a string literal that can be assigned to non primitives but not the
        // primitive ones
        // arr[3]=null; not possible
        arr2[3] = null;

    }

}
