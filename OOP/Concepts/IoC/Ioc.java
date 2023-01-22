package OOP.Concepts.IoC;

public class Ioc {
    public static void main(String[] args) {
        Ioc container=new Ioc();
        User user=container.new User();
        user.add("data added!");
    }

    //user
    class User{
        MySQLdatabase MySQl=new MySQLdatabase();
        void add(String data){
           MySQl.persist(data);
        }
    }

    //database
    class  MySQLdatabase{
        void persist(String data){
            System.out.println(data);
        }
    }
}
