package ZzQuickTests;

import java.util.ArrayList;

public class MyFraction {
    private int n;
    private int d;
    ArrayList<Integer> list=new ArrayList<Integer>();

    public MyFraction(int a,int b){
        this.n=a;
        this.d=b;
    }

    void divideByGCD() throws Exception{
        if(this.d==0) throw new Exception();
        this.list.add(1);
        if(this.n>=2){
            for (int i = 2; i <=n/2; i++) {
                if(n%i==0)this.list.add(i);
            }
        }
        this.list.add(n);
//        System.out.println(this.list);

        for (int i = list.size()-1; i >=0 ; i--) {
            int canbeGCD=list.get(i);
            if(this.d%canbeGCD==0){
                this.n/=canbeGCD;
                this.d/=canbeGCD;
                break;
            }
        }
    }

    public static void main(String[] args) {
        //parameterized constructor
        MyFraction obj=new MyFraction(20,10);
        obj.display();
    }

    void display(){
        try {
            divideByGCD();
            if(this.n>this.d){
                System.out.println("Improper fraction as denominator is bigger!");
            }
            System.out.println("Normalized form -> "+this.n+"/"+this.d);}
        catch (Exception e){
            System.out.println("Denominator cant be zero!");
        }

    }

}
