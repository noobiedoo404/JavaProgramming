//--EXTRA--code for assignment 2 
package Strings.MixedQuestions;

// import java.util.*;
// public class Test {

	// public static void main(String[] args) {
	// 	Scanner s = new Scanner(System.in);
	// 	String a, b;
	// 	System.out.print("Enter a: ");
	// 	a=s.nextLine();
	// 	System.out.print("Enter b: ");
	// 	b=s.nextLine();
	// 	int c = 0, d = 0;

	// 	for (int i = 0; i < a.length(); i++) {
	// 		for (int j = 0; j <= 9; j++) {
	// 			if ((int) a.charAt(i) - 48 == j) {
	// 				c = c * 10 + j;
	// 				break;
	// 			}
	// 		}
	// 	}
	// 	for (int i = 0; i < b.length(); i++) {
	// 		for (int j = 0; j <= 9; j++) {
	// 			if (((int) b.charAt(i)) - 48 == j) {
	// 				d = d * 10 + j;
	// 				break;
	// 			}
	// 		}
	// 	}
	// 	System.out.println("Sum of two numbers entered: " +(c + d));
    // s.close();
	// char a= ' ';
	// char b='1';
	// if(b>a)System.out.println(a+ "less than"+ b);
	// }
// }

import java.util.*;

public class Test {
	
	static int stringToInt(String x)
	{
		int y=0;
		
		for(int i =0;i<x.length();i++)
		{
			for(int j=0;j<=9;j++)
			{
				
				if(x.charAt(i)==(char)(j+'0'))
				{	
					y=y*10+j;
					break;
				}
			}
		}

		// while (y != 0) {
		// 	y1=y%10+y1;
		// 	y /= 10;
			
		//   }
		return y;
	}
	
	// static String intToString(int y) {
	// 	int a=y,l=0;
	// 	String str[]=null;
	// 	while(a!=0)
	// 	{
	// 		int r=a%10;
	// 		a=a/10;
	// 		l++;
	// 	}
	// 	while(y!=0)
	// 	{
	// 		int re=y%10;
	// 		y=y/10;
	// 		str[1]=(char)re;
	// 		i++;
	// 	}
	// }

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String a=null,b=null;
		System.out.print("Enter a number : ");
		a=s.nextLine();
		System.out.print("Enter a number : ");
		b=s.nextLine();
		int n1= stringToInt(a);
		int n2= stringToInt(b);
		int sum = n1+n2;
		a="";
		while (sum != 0) {
			a=sum%10+a;
			sum /= 10;
			
		  }
		System.out.println("Sum = "+a);
		s.close();
		
	}

}