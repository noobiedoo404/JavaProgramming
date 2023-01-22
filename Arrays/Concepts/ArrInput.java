package Arrays.Concepts;

import java.util.Scanner;



public class ArrInput{
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int []arr =new int[4];
    //Array Input
    arr[0]=0;
    arr[1]=1;
    arr[2]=2;
    arr[3]=3;
    //[0,1,2,3]
    // for(int i=0; i<arr.length;i++){
    //     System.out.print(arr[i]+ " ");
    // }
 
    //using for loop
    // System.out.println();
    // for(int i=0; i<arr.length;i++){
    //     arr[i]= in.nextInt();
    // }
    // for(int i=0; i<arr.length;i++){
    //     System.out.print(arr[i]+ " ");
    // }

    // for (int i : arr) {
    //     System.out.print(i+ " ");
    // }
    // String[] str=new String[5];

    // int k =0;
    // for (String i : str) {
    //     str[k]=in.next();
    //     k++;
    // }

    // for(int i=0; i<str.length;i++){
    //     str[i]= in.next();
    // }
   
    // System.out.println(Arrays.toString(str));

    int[] arrInt= new int[4];
    for (int i = 0; i < arrInt.length; i++) {
        arrInt[i]=in.nextInt();
    
    }

    for(int i: arrInt){
        System.out.print(i);
        
    }
    // System.out.println(arrInt[0]);
//  System.out.println(Arrays.toString(arrInt));


// String[] str= new String[4];
// for (String string : str) {
//     string=in.next();
// }
// for (String string : str) {
//     System.out.print(string);
// }

    in.close();
    }
}
