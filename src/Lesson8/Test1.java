package Lesson8;

public class Test1 {
    public final int a;
    public final int b=5;
//    final = const
//    Значение костанты передается при объявлении,
//    либо уже в КАЖДОМ конструкторе с одним и тем же значением

    final Test1 car=new Test1();
    //адрес car не возможно изменить. Он не может ссылаться на
    //другой объект. Но его параметры можно изменить
    Test1(){
        a=10;
    }
    Test1(boolean b){
         a=7;
    }

    public void  abc(final short s/* параметр не будет возможно изменить*/){
        final byte c;
        c=10;
        //Здесь можно обявлять значения после объявления
        System.out.println(s+c);
    }
    public static void main(String[] args) {
        Test1 t= new Test1();
        Test1 t2= new Test1(false);
//        t.a=t.a*2; - will be error

        System.out.println(t.a);
        System.out.println(t2.a);
    }
}

