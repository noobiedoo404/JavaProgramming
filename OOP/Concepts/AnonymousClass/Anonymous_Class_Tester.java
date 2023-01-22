package OOP.Concepts.AnonymousClass;

abstract class MyClass {
	abstract void meth();
}
interface MyInterface {
	 void meth();
}

class $Outer {
	void display() {
		MyClass obj = new MyClass() {
			void meth() {
				System.out.println("Hello..");// anonymous class defined
			}
		};
		obj.meth();
	}

	void display2(){
		MyInterface obj2=new MyInterface() {
			@Override
			public void meth() {
				System.out.println("hello from anonymous Interface");
			}
		};
		obj2.meth();

	}
}

public class Anonymous_Class_Tester {

	public static void main(String[] args) {
		$Outer obj = new $Outer();
		obj.display();
		obj.display2();

	}

}
