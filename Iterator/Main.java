package Iterator;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrList=new ArrayList<Integer>();
        Scanner in=new Scanner(System.in);
        System.out.print("input size of the arraylist");
        int n=in.nextInt();
        for (int i = 0; i < n; i++) {
            arrList.add(i,in.nextInt());
        }

        // An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. 
        // It is called an "iterator" because "iterating" is the technical term for looping.

        // To use an Iterator, you must import it from the java.util package.
        // The iterator() method can be used to get an Iterator for any collection:

        Iterator<Integer> it=arrList.iterator();
       
        // System.out.println(it.next());
        int count=0;
        while(count<2){
            System.out.print(it.next());
            count++;
        }
        //hasNext() checks if it has next element or not.
        while(it.hasNext()){
            //everytime next() method is called we are on the next element
            System.out.println(it.next());
        }

        //Note: Trying to remove items using a for loop or a for-each loop would not work correctly 
        //because the collection is changing size at the same time that the code is trying to loop.

        // Iterators are designed to easily change the collections that they loop through. 
        //The remove() method can remove items from a collection while looping.

        in.close();

    }
}
