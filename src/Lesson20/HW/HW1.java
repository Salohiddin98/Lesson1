package Lesson20.HW;

import java.util.ArrayList;
import java.util.Collections;

class Test1{
    static ArrayList<String> abc(String ...a){
        System.out.print("Введенный массив:");
        ArrayList <String>list=new ArrayList<>();
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
            if(!list.contains(a[i])){
                    list.add(a[i]);
            }
        }
        System.out.println();
        System.out.println("Созданный список:"+list.toString());
        Collections.sort(list);
        System.out.println("Отсортированный список:"+list);
        return list;

}
}

public class HW1 {
    public static void main(String[] args) {
Test1.abc("qwe","ewq","Hello","ok","qwe","wq","qwe","OK","World");

    }
}
