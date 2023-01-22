package ZzQuickTests;
public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int n=1000, x=1;
            int[] arr=new int[n];
            for (int i = 0; i <=arr.length; i++) {
                arr[i]=i/x;
            }
            System.out.println("no err");
        }

        //the sequence of catch blocks must be from specific to general from top to buttom
        catch(IndexOutOfBoundsException i){
            System.out.println("index out of bound");
        }
        catch(ArithmeticException a){
            System.out.println("Arithmetic exception");
        }

        //Exception is the class and above are the subclasses so the are more specific
        catch(Exception e){
            System.out.println("exception");
        }
    }
}
