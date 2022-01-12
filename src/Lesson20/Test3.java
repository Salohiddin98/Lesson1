package Lesson20;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list=new ArrayList<>();
        StringBuilder sb1=new StringBuilder("Hello");
        StringBuilder sb2=new StringBuilder("Ok");
        StringBuilder sb3=new StringBuilder("Privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (int i=0;i<list.size();i++){
            list.get(i).append("!");
        }
        for (StringBuilder a:list){
            System.out.println(a+" ");
        }

        System.out.println();

        list.remove(2);
        for (StringBuilder a:list){
            System.out.println(a+" ");
        }

        list.remove(new StringBuilder("Hello"));//Ничего не меняет
        list.remove(sb1);//удаляет элемент
        System.out.println();
        for (StringBuilder a:list){
            System.out.println(a+" ");
        }

        list.remove("Ok!!!");



    }
}
