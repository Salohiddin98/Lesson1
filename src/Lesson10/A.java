package Lesson10;
import Lesson9.*;


import static Lesson9.Student.c;
//импортирует статичную переменную

//import static Lesson9.*;
//импортирует все статичные переменные

//import Lesson8.*;
//.* - импорт всех классов пакета

//import java.lang.*;По умолчанию уже импортировано-стандартный пакет.

public class A {
    public static void main(String[] args) {
        Car c1=new Car("Black","V6");
        Student s2=new Student();
        int a=c;
        System.out.println(s2.z);
        System.out.println(c);//Статичная переменная не принадлежит объекту
        //Желательно использовать имя класса(как указано ниже)
        System.out.println(Student.c);
//Переменную ищет сперва внутри класса и только потом в импортируемом пакете

//        Lesson9.Car c1=new Lesson9.Car("Black","V6");
//        Lesson9.Student st1=new Lesson9.Student();
        // Если в двух классах есть одинаковые классы

        String s1 = new String();


    }
}
class B{
    /** Javadoc комментарий
     *
     *
     * */

    Student s3=new Student();

}

