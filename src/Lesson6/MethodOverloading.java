package Lesson6;

public class MethodOverloading {
    void show(int i1){
        System.out.println(i1);
    }
    void show(int i1,int i2){
        System.out.println(i1+" "+i2);
    }
    void show(String i1){
        System.out.println(i1);
    }
    void show(boolean i1){
        System.out.println(i1);
    }
    void show(String s,int i1){
        System.out.println(s+" "+ i1);
    }
    void show(int i1,String s){
        System.out.println(i1+" "+ s);
    }
}
class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading m0=new MethodOverloading();
        int a=500;
        m0.show(a);
        boolean b=true;
        m0.show(b);
        String s="qwerty";
        m0.show(s);
        m0.show(a,a);
        m0.show(s,a);
        m0.show(a,"test");
    }
}
