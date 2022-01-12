package Lesson22;

public class Test2 {
    void salaryUp(Employee e){
        e.salary=e.salary+100;
    }
    public static void main(String[] args) {
        Doctor doc=new Doctor();
        doc.name=("ivan");
        doc.age=50;
        doc.expiriance=25;
        doc.eat();
        doc.sleep();
        doc.heal();
    }
}
class Employee{
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
class Doctor extends Employee{
    void heal(){
        System.out.println("Heal");
    }
}
class Xirurg extends Doctor{
    String skalpel;
    void operatsiya(){}
}
class Dantist extends Doctor{
    }


class Teacher extends Employee{
    int usersNum;
    void teach(){
        System.out.println("Teach");
    }

}
class Driver extends Teacher{
    String carName;

    void drive(){
        System.out.println("Drive");
    }

}

