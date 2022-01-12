package Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList<>();
        for (int i=65;i<75;i++) {
            String s="";
            for (int j = 64; j < i; j++) {
                char a = (char)(j+1);
                s+=(""+a);
            }
            list.add(s);
        }
        System.out.println(list);

        ArrayList <String> list2=new ArrayList<>();
        list2.add("Test1");
        list2.add("Test2");
        list.addAll(list2);//Добавил List2 в list
        for (String a:list){
            System.out.print(a+" ");
        }
        System.out.println();
        list.addAll(0,list2);//Добавил List2 в list c 0 элемента
        for (String a:list){
            System.out.print(a+" ");
        }
        System.out.println();
        list2.set(1,"Ivanov");//Не влияет на list
        for (String a:list){
            System.out.print(a+" ");
        }

        System.out.println();
        System.out.println(list.indexOf("Test2"));
        System.out.println(list.lastIndexOf("Test2"));

        System.out.println(list.contains("Test2"));//содержит ли

        System.out.println("size="+list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.toString());//Вывод в виде строки
        list.clear();//очистка листа
        System.out.println(list.isEmpty());
        System.out.println(list);







    }
}
