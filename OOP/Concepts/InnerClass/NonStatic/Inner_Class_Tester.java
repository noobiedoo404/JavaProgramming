package OOP.Concepts.InnerClass.NonStatic;
//ALSO CALLED NON STATIC INNER CLASS
class _Outer {
	public int a = 10;
	static int b = 20;
	
/*
---------------------------------------------------------------------------------
	 --> it's possible that we are first creating an object, then defining it.
	 Inner obj2= new Inner();
---------------------------------------------------------------------------------
	 void f1(){
	 Inner obj=new Inner();
	 obj.display();
	 }
 */
	class Inner {
		int c = 30;
		 static int d = 40;

		void display() {
			System.out.println("Outer non static a is " + a);
			System.out.println("Outer static b is " + b);
			System.out.println("Inner non static c is " + c);
			 System.out.println("Inner static d is " + d);
		}
	}

	/*
	public void display_Inner() {
	 Inner obj= new Inner();
	 obj.display();
	 System.out.println(obj.c);
	 System.out.println(b);
	 }
	 */
}

public class Inner_Class_Tester {

	public static void main(String[] args) {
		// _Outer obj=new _Outer();
		// obj.display_Inner();
		// another way of creating inner class
		_Outer obj = new _Outer();

//		System.out.println(obj.b);
		System.out.println(_Outer.b);

		_Outer.Inner obj1 = obj.new Inner();
		// _Outer obj1 = new _Outer();
		obj1.display();

		/*
		--> For non-static attributes of a class we need to create instance of that class to access them.
		 System.out.println("Outer not static a is " + obj.a);
		 System.out.println("Inner non static c is " + obj1.c);

		 --> For static attributes of a class we do not need to create instance of that class to access them. Same goes for static methods too.
		    In the outer class, we created static variable b, so we don't need to create instance for accessing it.
		 System.out.println("Outer static b is " + _Outer.b);
		 System.out.println("Inner static d is " + _Outer.Inner.d);
		 */
  
	}

}
