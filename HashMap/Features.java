package HashMap;
import java.util.*;
public class Features {
    public static void main(String[] args) {
       HashMap<String, Integer> hm=new HashMap<>();
       hm.put("a",1);
       hm.put("b",2);
       hm.put("c",3);
       hm.put("d",4);
        System.out.println(hm);
        System.out.println(hm.remove("b"));
        System.out.println(hm.remove("a",1));
        System.out.println(hm.remove("e"));
        System.out.println(hm.remove("d",5));
    }
}
