package Lesson17;

class Car{}

public class Test1 {
    public static void main(String[] args) {

        //        String str=new String("qwerty");
//        System.out.println(System.identityHashCode(str));
//        str="asd";
//        System.out.println(System.identityHashCode(str));
//        System.out.println(str);
//        String s = "Welcome!This is CS211 Course";
//        System.out.println(System.identityHashCode(s));
//        s = s.replace("CS211", "CS222");
//        System.out.println(s);
//        System.out.println(System.identityHashCode(s));

        StringBuilder sb1= new StringBuilder();//по умолчанию 16 символов
        StringBuilder sb2= new StringBuilder("Good day!!!");//8(введенный текств)+16 символов
        StringBuilder sb3= new StringBuilder(50);//50-это вместимость количества символов
        StringBuilder sb4= new StringBuilder(sb2);

        System.out.println(sb2.length());
        System.out.println(sb3.capacity());
        System.out.println(sb2.charAt(5));
        System.out.println(sb2.indexOf("day"));
        System.out.println(sb2.indexOf("day",5));

        String s = sb2.substring(5);
        System.out.println(s);
        String s2=sb2.substring(5,8);
        System.out.println(s2);


        //Методы только для StringBuilder
        System.out.println(sb2.subSequence(5,8));//subSequence=subString, но выходит Char

        sb2.append(22);//изменяет сам StringBuilder.
        System.out.println(sb2);
        sb2.append(true);
        System.out.println(sb2);
        sb2.append(sb2);
        System.out.println(sb2);
        sb2.append(new Car());
        System.out.println();

        System.out.println(sb2.insert(4,55));//Вставляет элемент

        StringBuilder sb10=new StringBuilder("Hello World");
        sb10.delete(3,6);//Удаление отрывка текста
        System.out.println(sb10);

        sb10.deleteCharAt(0);//Удаление символа
        System.out.println(sb10);

        sb10.reverse();
        System.out.println(sb10);

        sb10.replace(0,4,"Hello ");
        System.out.println(sb10);
        System.out.println(sb10.capacity());







    }



}
