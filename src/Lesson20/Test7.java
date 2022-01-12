package Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Test7 {
    public static void main(String[] args) {
        String s1="A";
        String s2="B";
        String s3="C";
        String s4="D";
        ArrayList<String>list=new ArrayList<>();
        list.add(s3);
        list.add(s2);
        list.add(s1);
        list.add(s4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<String>list1=list;
        System.out.println(list.equals(list1));

        ArrayList<String>list3=new ArrayList<>();
        list3.add(s1);
        list3.add(s2);
        list3.add(s3);
        list3.add(s4);
        System.out.println(list3.equals(list));


    }
}
