package Lesson11;

public class Student {
    String name;
    int course;
    double grade;
    Student(String name,int course,double grade){
        this.name=name;
        this.course=course;
        this.grade=grade;
    }

    public static void swap(Student s1,Student s2){
        /*
        При выполнении метода, создаются копии объектов класса:
        st1* передается s1.
        А в конце метода s1 уничтожается.
        По сути замена адресов не происходит
         */
        Student s3=s1;
        s1=s2;
        s2=s3;
        System.out.println("Name:"+s1.name);
        System.out.println("Name:"+s2.name);
    }

    public static void changeName(Student s1){

        s1.name="Vasiliy";
    }


    public static void main(String[] args) {
        Student st1 = new Student("Ivan",3,9.5);
        Student st2 = new Student("Petr",1,5.3);

        System.out.println("Name:"+st1.name+" Course:"+st1.course+" Grade="+st1.grade);
        System.out.println("Name:"+st2.name+" Course:"+st2.course+" Grade="+st2.grade);

        swap(st1,st2);
        changeName(st2);
        System.out.println("Name:"+st1.name+" Course:"+st1.course+" Grade="+st1.grade);
        System.out.println("Name:"+st2.name+" Course:"+st2.course+" Grade="+st2.grade);

    }
}

