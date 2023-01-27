package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {

        byte a1=10;
        byte a2=20;
        byte a3=100;
//      byte только от -128 до  127

        short b1=5;
        short b2=-10;
        short b3=0;

        int c1=500;

        long d1=1000;
        long d2=10000000000L;
        //L в конце;

        float e1=3.14f;//fload 32 bit
        float e2=2.5F;

        double f1=5.5;
        double f2=33.5;

        char g1='a';
        char g2='A';
        char g3='3';
        char g4=' ';

        System.out.println(f2);

        char g5=300;//Значение в UNICODE (x10-система счисления)

        System.out.println(g5);

        char g6='\u0500'; //Значение в UNICODE-минимум 4х значная цифра (x16)

        System.out.println(g6);

        boolean bool1=true;
        boolean bool2=false;

        System.out.println(bool1);


        int h1=60;
        int h2=0b11100;//или h2=0B11100;  двоичная
        int h3=074;//восмиричная;
        int h4=0x3c;//шеснадцатиричная

        int a7=1_____000_000;
        /*_ можно разделить нижним пробелом для удобсства.
        Можно делить что угодно и сколько угодно
        Нельзя использовать в начале и в конце
        Нельзя до и после  букв F f L l D d
        Нельзя до и после 0x 0X 0B 0b
        Можно послу 0 указывающий на восмиричную систему*/


    }
}
