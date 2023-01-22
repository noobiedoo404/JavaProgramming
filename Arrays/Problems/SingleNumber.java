package Arrays.Problems;

// import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] tempArr = { 1, 2, 1, 2, 4 };
        System.out.println(func(tempArr));
    }

    static int func(int[] arr) {
        int[] list1 = new int[3 * 10000];
        int[] list2 = new int[3 * 10000];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                if (list1[arr[i]] == 0) {
                    list1[arr[i]] = 1;
                }
                
                   else{ list1[arr[i]] = 2;}
                
            } else {
                if (list2[(arr[i] * -1)] == 0) {
                    list2[(arr[i] * -1) ] = 1;
                }
                
                    else{list2[(arr[i] * -1)] = 2;}
                
            }
        }
        for (int i = 0; i < list1.length; i++) {
        if(list1[i]==1){
            return i;
        }
        if(list2[i]==1){
            return -i;
        }
        }
        return 0;
    }
}
