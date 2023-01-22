    package Strings.Comparisions;


public class Main{
    public static void main(String[] args) {
        String a="abcdefg";
        // System.out.println(comparison_1(a.charAt(1),a.charAt(3)));
        // System.out.println(comparison_2(a.charAt(1),a.charAt(3)));
        System.out.println(comparision_3(a.substring(0,4),a.substring(0,4)));
    }

    //compares two characters using compare method of Character class 
    static boolean comparision_1(char a, char b){
        return Character.compare(a,b)==0;   
    }

    //compares two characters using == operator
    static boolean comparision_2(char a, char b){
        return a==b;   
    }


    static boolean comparision_3(String a, String b){

        String c1="fkldsjfksfsdkfj";
        String d1="fkldsjfksfsdkfj";
        String c2=new String("fkldsjfksfsdkfj");
        String d2=new String("fkldsjfksfsdkfj");
        // return c.substring(0,3).equals(c.substring(0,3));

        //both c1 and d1 are refering to the same string that is "fkldsjfksfsdkfj"
        System.out.println(c1==d1);

        //to know the type of the object
        System.out.println(c2.getClass().getSimpleName());
        System.out.println(c2==d2);
        System.out.println(c1.equals(d1));
        System.out.println(c2.equals(d2));



        return c1.equals(d1);
        
        // return a==b;

    }




} 