package OOP.Concepts.ExceptionHandling;

//nested try-catch and a try block having multiple catch blocks

public class ExceptionHandling_2 {
    public static void main(String[] args) {
        int a[]={0,2,3,4,5},b,c;
        //nested try-catch :)
        try{
             b=a[2]/a[2];
            System.out.println(b);
            try{
                 c=a[2]/a[4];
                System.out.println(c);
            }

            catch(ArrayIndexOutOfBoundsException f){
                System.out.println("Array index out of bound.");
            
            }
        }
        catch(ArithmeticException e){
            System.out.println("Denominator must be not zero.");
        }

        //one try block can have multiple catch block
        //if classes in the catch function are in inheritance hierarchy then,first one should be subclass of the next one.
        try{
            b=a[1]/a[1];
            System.out.println(b);
            c=a[5];
            System.out.println(c);

        }
        catch(ArithmeticException e){
            System.out.println("Hor sunno hote hobe..Noile hobe na.");
        }
        catch(ArrayIndexOutOfBoundsException f){
            System.out.println("Index array er baire.");
        }
        
        }
}
