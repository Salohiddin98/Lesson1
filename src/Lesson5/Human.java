package Lesson5;

public class Human {
    String name;
    Car3 car;
    BAccount bA;

    void  info(){
        System.out.println("Name: "+name+ " Color: "+car.color+ " Balance: "+ bA.balance);
    }

}
class HumanTest{
    public static void main(String[] args) {
        Human h= new Human();
        h.name="David";
        h.car=new Car3("Red","v8");
        h.bA= new BAccount(18,20.5);
        h.info();
    }
}

class Car3{
    Car3(String a,String b){
        color=a;
        engine=b;
    }
    String color;
    String engine;
}

class BAccount{
    BAccount(int c, double d){
        id=c;
        balance=d;
    }
    int id;
    double balance;
}