package Lesson23;

public class Test2 {
    public static void main(String[] args) {
        Employee2 e=new Employee2();
        Teacher2 t=new Teacher2();
        Employee2 t1=new Teacher2();
        e.eat();
        t.eat();
        t1.eat();

    }
}

class Food{

}
class Fruits extends Food{

}


class Employee2{
    String name;
    int age;
    int expiriance;
    double salary=100;
    Food eat(){
        System.out.println("Employee is eating");
        Food f=new Food();
        return f;
    }
    void sleep(){
        System.out.println("Sleep");
    }



}
class Teacher2 extends Employee2 {
    Food eat(){
        System.out.println("Teacher is eating");
        Fruits f=new Fruits();
        return f;
    } //Method overriding - перезапись метода из родительского класса
    //если идет разница в параметрах но название метода одинаковое-это overloading(перезагрузка)
    int usersNum;
    void teach(){
        System.out.println("Teach");
    }
}


class A{
    Employee2 objectCreation(){
        System.out.println("ok");
        return new Employee2();
    }
}
class B{
    Teacher2 objectCreation(){
        System.out.println("ok");
        return new Teacher2();
    }
}
