package OOP.Concepts.InnerClass.Static;
class $$Outer{
	static int a=10;
	int b=20;
	static class Inner{
            void meth1(){
				int c=30;
//				 static int d=40;
				System.out.println("a = "+ a);
				/*
				--> a static inner class can not access non-static member of outer class
				System.out.println("b = "+ b);
				 */
				System.out.println("c = "+ c);
//				 System.out.println("d = "+ d);
			}

			static String meth2(){
				return "hello from meth2";
			}

			 class Inner_Inner{
				static int a=10;
				static void meth3(){
					System.out.println("hello from Inner_Inner!");
				}

		}
		}
	
}
public class Static_InnerClass_Tester {

	public static void main(String[] args) {
		System.out.println($$Outer.a);
		System.out.println("It's too deep->"+$$Outer.Inner.Inner_Inner.a);
		$$Outer.Inner.Inner_Inner.meth3();

		System.out.println($$Outer.Inner.meth2());

	$$Outer.Inner i=new $$Outer.Inner();
	//here we don't need to create any object of outer class to access the static inner class
	i.meth1();
		$$Outer.Inner.Inner_Inner obj_Inner_Inner=i.new Inner_Inner();
		obj_Inner_Inner.meth3();
	}
	

}
