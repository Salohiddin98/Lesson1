package Lesson8;

public class Student {
    String name;
    int course;
    static int count;

//    static делает его общей переменной
//    count будет увеличиваться, так как "отвязан" от всех
//    и принадлежать всему классу а не каждому объекту

    //    static final-константа всего класс

    public Student(String name2,int course2){
        name=name2;
        course=course2;
        count++;
        //всегда count=1 (без static) так как глобальное значение =0
        //отсчет всегда идет с  0
        System.out.println("Student number "+count+" created");
    }
    public static void showCount(){
        System.out.println("Number of created students:"+count);
    }
    public void abc(){

    }


}


class StudentTest{
    public static void main(String[] args) {
        Student st1=new Student("Ivan",1);
        Student st2=new Student("Petr",4);
        Student st3=new Student("Masha",2);


        System.out.println();
        System.out.println(st1.name);
        System.out.println(Student.count);
        System.out.println(st1.count);
        System.out.println(st2.count);

        Student.showCount();
        st3.showCount();

    }
}
