package Lesson22;

public class Test3 {
}
class Human2 {
//    Human2(){
//        System.out.println("qwerty");
//    }
    String name;
    String surname;
    Human2(String n){
        this(n,null);
    }
    Human2(String n,String s){
        this.name=name;
        this.surname=surname;
    }
}
class Student2 extends Human2{
//    Student2(){
//        super();
//        //конструктор по умолчанию класса Student2
//        //вызовет конструктор по умолчанию класса Human2
//    }
    Student2(){
        super("Petya");
        //конструктор класса Student2
        //вызовет конструктор класса Human2
    }
    Student2(int i){
        this();
        System.out.println("Hello");
    }



    public static void main(String[] args) {
        Student2 s=new Student2();
    }
}