/*
Q:  find no. of occurrences of all the words in a string whose occurrences are more than once.
e.g. In the string "i love love java java programming", i occurs once, love twice, java twice, programming once.
so we need to print love-2, java-2
*/
package HashMap;

//import java.util.Iterator;
import java.util.HashMap;

public class FindAllDuplicates {
    public static void main(String[] args) {
        String str="i love love java java programming";
            func(str);
    }
    static void func(String str){
        //split the string
        String[] arr=str.split(" ");

        //create a HashMap
        HashMap<String,Integer> hm=new HashMap<>();

        //Iterate the string and insert into the HashMap
        for (String s:arr) {
            //if the key doesnt exist, we will insert new key and set the value as 1.
            if(hm.get(s)==null){
                hm.put(s,1);
            }
            //else we ll increase the value of the corresponding key by 1.
            else{
                int value=hm.get(s);
                hm.put(s,value+1);
            }
        }
        //finally getting no. of occurrences of all the words in a string whose occurrences are more than once.

        //two ways
//        1.by enhanced for loop(easier)
        for (String s : hm.keySet()) {
            if (hm.get(s) != 1) System.out.println(s + " occurs " + hm.get(s) + " times.");
        }
        // 2.by iterator
//        Iterator<String> it=hm.keySet().iterator();
//        while(it.hasNext()){
//            String s=it.next();
//            if(hm.get(s)!=1) System.out.println(s+" occurs "+hm.get(s)+" times.");
//        }

//
    }
}
