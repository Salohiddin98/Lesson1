package Lesson23;

public class Test2 {
    public static void main(String[] args) {
        Teacher2 t=new Teacher2();
        t.eat();
    }
}
class Employee2{
    String name;
    int age;
    int expiriance;
    double salary=100;
    void eat(){
        System.out.println("Eat");
    }
    void sleep(){
        System.out.println("Sleep");
    }
}
class Teacher2 extends Employee2 {
    int usersNum;
    void teach(){
        System.out.println("Teach");
    }
}