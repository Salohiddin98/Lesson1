package Lesson20;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

//        ArrayList может быть любого типа кроме простых
        ArrayList list=new ArrayList();
        list.add("privet");
        Car c=new Car();
        list.add(c);
        Student s=new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));

//        Типизированный ArrayList
//        ArrayList <String> list2=new ArrayList<String>(); -Полный вид
        ArrayList <String> list2=new ArrayList<>();//Сокращенный вид
        list.add("123213213");
//        list2.add(s);-не подходит тип

        //Можно и так писать, но они отличаются
        ArrayList <StringBuilder> list3=new ArrayList<>(30);
        list2.add("poka");
        List <StringBuilder> list4=new ArrayList<>();
        list4.add(new StringBuilder("ok4"));

        //Создается ArrayList копия list2,но ссылаются на разные объекты
        ArrayList <String> list5=new ArrayList<>(list2);




    }

}
class Car{}
class Student{}