package Lesson13;

public class Test1 {
}
class Student{
    int grade;
    Student (int grade){
        this.grade=grade;
    }

    public static void main(String[] args) {
        Student st1=new Student(6);
//        switch (st1.grade)
//        switch (int/byte/short/char/String)-только эти типы данных
//        switch (3)//сработает с 3го
        switch (1)//сработает default
        {
            case 2:System.out.println("2");break;
            case 3:System.out.println("3");break;
            case 4:System.out.println("4");break;
            case 5:System.out.println("5");break;
            default:System.out.println("ERROR!");//можно писать где угодно но с break
        }

    }
}
