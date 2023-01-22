package Patterns;

//rules:
//1.no of lines=no of rows
//2.

public class AllInOne {
    public static void main(String[] args) {
        pattern1();
        drawLine();
        pattern2();
        drawLine();
        pattern3();
        drawLine();
        pattern4(6);
        drawLine();
        pattern5(6);
        drawLine();
        pattern6(5);
        drawLine();
        pattern7(5);
        drawLine();
        pattern8(5);
        drawLine();
        pattern9(5);
    }

//    1.
//            *
//            **
//            ***
//            ****
//            *****
    static void pattern1(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println(
            );
        }
    }
//    2.
//        *****
//        ****
//        ***
//        **
//        *
    static void pattern2(){
        for(int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=6-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    3.
//            1
//            12
//            123
//            1234
//            12345

    static void pattern3(){
        for(int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

//    4.
//            *
//            **
//            ***
//            ****
//            *****
//            ******
//            *****
//            ****
//            ***
//            **
//            *
    static void pattern4(int n){
        for(int i = 1; i <=2*n-1 ; i++) {
            
            if(i<=n){
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            }
            else{
                for(int j = 1; j <=2*n-i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
//        5.
//                 *
//                 **
//                 ***
//                 ****
//                 *****
//                 ******
//                 *****
//                 ****
//                 ***
//                 **
//                 *
    static void pattern5(int n){
        for (int i = 1; i <=2*n-1; i++) {
            if(i<=n){
                //spaces
                for (int j = 1; j <=n-i; j++) {
                    System.out.print(" ");
                    
                }
                for (int j = 1; j <=i ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                //spaces
                for (int j = 1; j <=i-n; j++) {
                    System.out.print(" ");
                    
                }
                //stars
                for (int j = 1; j <=2*n-i ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
//    6.
//              1
//            1 2 1
//          1 2 3 2 1
//        1 2 3 4 3 2 1
//      1 2 3 4 5 4 3 2 1
    static void pattern6(int n){
        for (int i = 1; i <= n ; i++) {
            //spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            //values
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            for (int j = i-1; j >=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
//    7.
//            1
//          2 1 2
//        3 2 1 2 3
//      4 3 2 1 2 3 4
//    5 4 3 2 1 2 3 4 5
    static void pattern7(int n){
        for (int i = 1; i <=n ; i++) {
            //space
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

//    8.
//                     1
//                   2 1 2
//                 3 2 1 2 3
//               4 3 2 1 2 3 4
//             5 4 3 2 1 2 3 4 5
//               4 3 2 1 2 3 4
//                 3 2 1 2 3
//                   2 1 2
//                     1
    static void pattern8(int n){
        for (int i = 1; i <=2*n-1 ; i++) {
            //space
            if(i<=n){
                for (int j = 1; j <=n-i ; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j >=1 ; j--) {
                    System.out.print(j+" ");
                }
                for (int j = 2; j <=i ; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            else{
                for (int j = 1; j <=i-n ; j++) {
                    System.out.print("  ");
                }
                for (int j = 2*n-i; j >=1; j--) {
                    System.out.print(j+" ");
                }
                for (int j = 2; j <=2*n-i ; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }

        }
    }
//9.
//                A
//              A B A
//            A B C B A
//          A B C D C B A
//        A B C D E D C B A
    static void pattern9(int n){
        for (int i = 1; i <=n ; i++) {
            //spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            //for value
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(64+j)+" ");
            }
            for (int j = i-1; j >=1 ; j--) {
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();

        }
    }

    static void drawLine(){
        for (int i = 0; i < 10; i++) {
            System.out.print("- ");
        }
        System.out.println();
    }
}


