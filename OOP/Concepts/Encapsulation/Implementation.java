package OOP.Concepts.Encapsulation;
/* Encapsulation is basically limiting the direct access of class attributes i.e., not letting the users to directly access the class attributes
* and manipulate them from outside the class.
*
* This is achieved through using methods with suitable access modifiers (the popular get,set methods ;these are names only ..it can be any method).
*
* Advantage--> Achieve security of clas
* */

public class Implementation {
    public static void main(String[] args) {
        TestClass obj=new TestClass();
//        System.out.println(obj.a);
        System.out.println("a-> "+obj.get());
        System.out.println("b-> "+obj.b);
        obj.set_a(0);
        System.out.println("modified a-> "+obj.get());

    }
}

class TestClass{

//    as the attribute 'a' is private, objects outside the class can not access it nor can modify it.
    private int a=10;
    public int b=20;

    //for accessing the private attribute
    public int get(){
        return this.a;
    }

    // for manipulating class attribute
    public void set_a(int x){
        this.a=x;
    }

}
