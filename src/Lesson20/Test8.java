package Lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Test8 {
    public static void main(String[] args) {
        String s1="A";
        String s2="B";
        String s3="C";
        String s4="D";
        ArrayList<String> list=new ArrayList<>();
        list.add(s3);
        list.add(s2);
        list.add(s1);
        list.add(s4);

        Iterator<String>it=list.iterator();//Еще один метод вывода
        while (it.hasNext()){
            System.out.println(it.next());
        }

        ListIterator<String>it1=list.listIterator();//Еще один метод вывода
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println();
        ListIterator<String>it2=list.listIterator();//Еще один метод удаления
        while (it2.hasNext()){
it2.next();
it2.remove();
        }
        for (String s:list){
            System.out.println(s+" ");
        }


    }
}
