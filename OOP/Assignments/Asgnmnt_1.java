package OOP.Assignments;
import java.util.Scanner;
public class Asgnmnt_1 {
    public static void main(String[] args) {
        int n;
        int[] a = new int[10];  
        System.out.print("Enter the number of elements in the array: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element_"+ (i+1) +": " );
            a[i]=sc.nextInt();
        }
        String temp = "";
        char test=' ';

        for (int i = 0; i < n; i++) {
            temp += String.valueOf(a[i]);
        }
        char[] CharArr = new char[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            CharArr[i] = temp.charAt(i);
        }
        int max_freq = 0;
        
        
        for (int i = 0; i < temp.length(); i++) {
            char temp1;
            for (int j = i+1; j < temp.length(); j++) {
                if (CharArr[i] > CharArr[j]) {
                    temp1=CharArr[j];
                    CharArr[j]=CharArr[i];
                    CharArr[i]=temp1;
                }
            }

        }

        // for (int i = 0; i < CharArr.length; i++) {
        //     System.out.print(CharArr[i]);
        // }
        
        for (int i = 0; i < temp.length()-1; i++) {
            int Current_freq = 1;
            for (int j = i+1; j < temp.length(); j++) {
                if (CharArr[i] == CharArr[j] ) {
                    Current_freq++;
                    if(Current_freq>=max_freq){
                         max_freq=Current_freq;
                         test = CharArr[i];
                        //  System.out.println(test);
                    }

                
                    
                    


                }
                else{
                    break;
                }
            }

        }
        System.out.println("\nThe most frequently occurring digit in the series of numbers in the given array = "+ test);
        sc.close();

    }
    
}
