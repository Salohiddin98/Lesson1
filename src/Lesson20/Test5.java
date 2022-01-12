package Lesson20;

import java.util.*;

class Storm{}

class Tester{
    String a;
    Tester(String b){
        a=b;
    }
}

public class Test5 {
    public static void main(String[] args) {
        Storm st=new Storm();
        Storm st1=new Storm();
        ArrayList <Storm> storm=new ArrayList<>();
        storm.add(st);
        storm.add(st1);
        System.out.println(storm.get(1));

        Tester sb1=new Tester("A");
        Tester sb2=new Tester("B");
        Tester sb3=new Tester("C");
        ArrayList <Tester> list=new ArrayList<>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        ArrayList <Tester> list1=(ArrayList<Tester>) list.clone();
        ArrayList <Tester> list2=list;
        ArrayList <Tester> list3=new ArrayList<>(list);
        System.out.println(list==list1);
        System.out.println(list==list2);
        System.out.println(list==list3);
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        
        
    }
}
