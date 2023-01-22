package Strings.MixedQuestions;
// import java.lang.*;
import java.util.Scanner;

public class Airport_charges {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int luggage_thrshold,to_be_paid=0;
        int[] weights=new int[10];
        // int weights[]={1,2,3,4};
        int no_of_luggages;
        System.out.println("Enter no. of luggages: ");
        no_of_luggages= sc.nextInt();
        for(int i=0;i<no_of_luggages;i++){
            weights[i]=sc.nextInt();
        }
        System.out.println("Enter the threshhold weight: ");
        luggage_thrshold=sc.nextInt();
        for(int i=0;i<no_of_luggages;i++){
            if (weights[i]<=luggage_thrshold){
               to_be_paid+=1;
            }
            else{
                to_be_paid+=2;
            }
        }

        System.out.println(to_be_paid);
        sc.close();


    }
}
