package Lesson24;

public class Test3 {
}

interface I1 {
    void abc();

    //default всегда объ€зано иметь тело и в классе его не нужно перезаписывать
    default void show() {
        System.out.println("Show");
    }
}

class Z implements I1 {
    public void abc() {
        System.out.println("abc func");
    }
}