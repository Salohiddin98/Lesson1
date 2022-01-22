package Lesson23;

public class Test4 {
    public static void main(String[] args) {
        Employee3 emp=new Employee3();
        Teacher3 t=new Teacher3();
        emp.sleep();
        t.sleep();
        Employee3 e=new Teacher3();
        e.sleep();
    }
}

//class Food{
//
//}
//class Fruits extends Food{
//
//}

class Employee3{
    String name;
    double salary=100;
    Food eat(){
        System.out.println("Employee is eating");
        Food f=new Food();
        return f;
    }
  static void sleep(){
        System.out.println("Employee is Sleeping");
    }



}
class Teacher3 extends Employee3 {
    @Override
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
    static void sleep(){
        System.out.println("Teacher is Sleeping");
    }
}

//final не дает переопределить или спрятать методы
//Так же не дает иметь наслелдников если применен к классу

//final class T{}
//class P extends T{}