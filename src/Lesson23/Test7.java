package Lesson23;

public class Test7 {

}

class A10{
    String s1="privet";
    static double d1=3.14;

    int summa(int ...i){
        int result=0;
        for(int a:i){
            result+=a;
        }
        return result;
    }
    static void abc(){
        System.out.println("static method");
    }

}

class B10 extends A10{
    String s1=super.s1+", drug";//super используется для hidden переменных

    int summa(int ...i){
        int result=super.summa(i);
        System.out.println("Summa="+result);
        return result;
    }

    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s1);
        b.abc();
    }

}