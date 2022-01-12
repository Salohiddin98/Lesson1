package Lesson23;

public class Test1{

//    public Object abc()
//    {return  new Doctor();}

    public static void main(String[] args) {
//    Doctor d=new Doctor();
//    Teacher t=new Teacher();
//    Driver dr=new Driver();
//    Employee e=new Employee();

    Employee emp1=new Doctor();

        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.expiriance);
        emp1.sleep();
        emp1.eat();


    Employee emp2=new Teacher();
    Employee emp3=new Driver();

    Xirurg x=new Xirurg();
    Doctor d1=new Xirurg();
    Employee emp4=new Xirurg();


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
class Doctor extends Employee {
    void heal(){
        System.out.println("Heal");
    }
}
class Xirurg extends Doctor {
    String skalpel;
    void operatsiya(){}
}

class Teacher extends Employee {
    int usersNum;
    void teach(){
        System.out.println("Teach");
    }
}
class Driver extends Teacher {
    String carName;

    void drive() {
        System.out.println("Drive");
    }
}