package Lesson20;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList<>();
        list.add("privet");//добавление
        list.add("poka");
        list.add("ok");
        list.add(1,"Hello");//Добавление между
        for (String a:list){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println(list.get(3));//получение определенное значения
        System.out.println(list);

        list.set(1,"Replaced");//Замена значения
        System.out.println(list);
//        ArrayList <Integer> list2=new ArrayList<>();

    }
}
