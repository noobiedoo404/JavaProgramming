package ArrayList._2D_ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int n=in.nextInt();
        ArrayList<ArrayList<Integer>> arrList=new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int d=in.nextInt();
            ArrayList<Integer> list=new ArrayList<>(d);
            for (int j = 0; j < d; j++) {
                list.add(j, in.nextInt());
            }
            arrList.add(i,list);
        }
        System.out.println(arrList);
        int q=in.nextInt();
        int[][] arr=new int[q][2];
        for (int i = 0; i < q; i++) {
            arr[i][0]=in.nextInt();
            arr[i][1]=in.nextInt();
        }
        
        System.out.println("using simple for loop");
        for (int i = 0; i < q; i++) {
            System.out.println(arrList.get(arr[i][0]).get(arr[i][1]));
        }

        System.out.println("using enhanced for loop");
        Iterator<ArrayList<Integer>> it= arrList.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        in.close();
    


    }
}
