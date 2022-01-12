package Lesson20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("A");
        StringBuilder sb2=new StringBuilder("B");
        StringBuilder sb3=new StringBuilder("C");
        ArrayList <StringBuilder> list=new ArrayList<>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        ArrayList <StringBuilder> list1=(ArrayList<StringBuilder>) list.clone();
        ArrayList <StringBuilder> list2=list;
        ArrayList <StringBuilder> list3=new ArrayList<>(list);
        System.out.println(list==list1);
        System.out.println(list==list2);
        System.out.println(list==list3);
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        Object [] array1=list1.toArray();
        System.out.println(array1);
        for (Object a:array1){
            System.out.print(a+" ");
        }

        System.out.println();

//        StringBuilder [] array2=list.toArray(new StringBuilder[list.size()]);
//        StringBuilder [] array2=list.toArray(new StringBuilder[10]);
        StringBuilder [] array2=list.toArray(new StringBuilder[1]);
        for (Object a:array2){
            System.out.print(a+" ");
        }
        System.out.println();

        StringBuilder[]array={sb2,sb3,sb3,sb3};
        List <StringBuilder> list4= Arrays.asList(array);
        System.out.println(list4);
        array[0].append("!!!");
        System.out.println(list4);
        array[0]=new StringBuilder("!!!");
        System.out.println(list4);



    }
}
