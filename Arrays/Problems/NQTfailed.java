package Arrays.Problems;
import java.util.*;
class NQTfalied{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=' ')
            b=b+a.charAt(i);
        }
        System.out.println(b);
        // int c=sc.nextInt();
        String c=sc.next();
                // if(b.substring(i,j+1)==c){
                //     System.out.println("Substirng found!");
                // }
                 if(b.indexOf(c)!=-1){
                    System.out.println("Substirng found!");
                }
                sc.close();
    }
}