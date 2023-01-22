// Q. Sort by the frequency of the element occurring in the array.
package HashMap;
import java.util.*;

import java.util.HashMap;

public class SortByFrequency {
    public static void main(String[] args) {
        int[] numberArr={1,2,2,5,6,7,5,5,7,7,7,6,1,1};
        func(numberArr);
    }
    static void func(int[] arr){
        HashMap<Integer,Integer> hm=new HashMap<>();
        //inserting key, value in the hashmap
        //using for loop
//        for (int i = 0; i <arr.length ; i++) {
//            if(hm.get(arr[i])==null){
//                hm.put(arr[i],1);
//            }
//            else{
//                int value=hm.get(arr[i]);
//                hm.put(arr[i],value+1);
//            }
//        }
        //using enhanced for loop
        for(int a:arr){
            hm.merge(a, 1, (oldValue, newValue) -> oldValue  + newValue);
            //can also use the below code
//            hm.merge(a, 1, Integer::sum);

        }
        int size=hm.size();
        for(int i=0;i<size;i++){
            int max=1;
            int key=0;
            for(int tempkey:hm.keySet()){
                int temp=hm.get(tempkey);
                if(temp>max)key=tempkey;
            }
            System.out.println(key+", "+hm.remove(key));
        }

    }
}
