package Lesson6.OW;

public class HelloWorld{

    public static void main(String []args){
        Student st1= new Student(1,320,"Salohiddin","Rashidov",4);
        Student st2= new Student(1,"Salohiddin","Rashidov",4);
        Student st3= new Student();
        System.out.println(st1.id+" "+st1.group+" "+st1.name+" "+st1.surname+" "+st1.course);
        System.out.println(st2.id+" "+st2.group+" "+st2.name+" "+st2.surname+" "+st2.course);
        System.out.println(st3.id+" "+st3.group+" "+st3.name+" "+st3.surname+" "+st3.course);
    }
}

class Student{
    int id,group,course;
    String name,surname;
    Student(int id2, int group2, String name2, String surname2,int course2){
        id=id2;
        group=group2;
        name=name2;
        surname=surname2;
        course=course2;
    }
    Student(int id2, String name2, String surname2,int course2){
        this(id2,0,name2,surname2,course2);
    }
    Student(){
        this(0,0,null,null,0);
    }

}