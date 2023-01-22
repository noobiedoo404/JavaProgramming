package OOP.Concepts.Basics;

class Second {
    public String fname = "John";
    // private String lname = "Doe";
    // private String email = "john@doe.com";
    // private int age = 24;
}

public class Main {
    public static void main(String[] args) {
        Second obj = new Second();
        System.out.println(obj.fname);
    }
}