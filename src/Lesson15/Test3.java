package Lesson15;

public class Test3 {
    public static void main(String[] args) {
        int a=5;
        while (++a>10/*a=6*/){

            a++;
        }
        System.out.println(a);
        System.out.println();

        a=5;
        while (++a<10){
            a++;
        }
        System.out.println(a);
        System.out.println();

        a=5;
        while (a++<10){
            a++;
        }
        System.out.println(a);
    }
}
