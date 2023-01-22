package HashMap;
import java.util.*;

public class ImplementHashMap {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("Name","Partha");
        hm.put("Age","24");
        hm.put("Job","In search");
        hm.put("Year of Experience","0");

        //iteration
        //Enhanced For loop
        for(String s:hm.keySet()){
            System.out.println(s+" "+hm.get(s));
        }
        //iterator
        Iterator<String> it=hm.keySet().iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s+" "+hm.get(s));
        }

    }
}
