package Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1=new String("Privet");
        String s2=new String("abcdefgabc");


        int a=s1.length();//длина строки
        System.out.println("length="+a);

        char c1=s1.charAt(0);//Символ строки под 0 индексом
        System.out.println(c1);

        //indexOf- выводит индекс заданного значения
        int i1=s1.indexOf('t');//char
        System.out.println(i1);

        int i2=s1.indexOf("vet");//string
        System.out.println(i2);

        int i3=s1.indexOf("vt");//string
        System.out.println(i3);//так как нету схожего, выведет -1

        int i4=s2.indexOf('a',4);//char искачть с 5 элемента
        System.out.println(i4);

        int i5=s2.indexOf("abc",5);//string  искачть с 7 элемента
        System.out.println(i5);


        boolean b1=s2.startsWith("abc");//Начинается ли строка с abc
        System.out.println(b1);

        boolean b2=s2.startsWith("abc",7);
        System.out.println(b2);


        boolean b3=s2.endsWith("abc");//Заканчивается ли строка с abc
        System.out.println(b3);



    }
}