package Strings.StringBuilder;

public class TestStringBuilder {
    public static void main(String[] args) {
        System.out.println(checkWhiteSpace("parth a"));
    }
    static String checkWhiteSpace(String str){
        StringBuilder newStr=new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            if(!Character.isWhitespace(str.charAt(i))){
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }

}
