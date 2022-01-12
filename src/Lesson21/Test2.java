package Lesson21;

public class Test2 {
    static final int i=5;
    void Test2(){
        System.out.println("Конструктор");
    }
    Test2(){
        System.out.println("Метод");
    }
}
class A{
    public static void main(String[] args) {
        Test2 t=new Test2();

    }
}
