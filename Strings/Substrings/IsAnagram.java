package Strings.Substrings;
import java.util.*
;
public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("silent","listen"));
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] c=a.toLowerCase().toCharArray();
        char[] d=b.toLowerCase().toCharArray();
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        // Arrays.sort(c);
        // Arrays.sort(d);
        for(int i=0;i<c.length;i++){
            for (int j = i+1; j < c.length; j++) {
                if(c[i]>c[j]){
                    char temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        
        for(int i=0;i<d.length;i++){
            for (int j = i+1; j < d.length; j++) {
                if(d[i]>d[j]){
                    char temp=d[i];
                    d[i]=d[j];
                    d[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        if(c.equals(d))return true;
        return false;
    }

}
