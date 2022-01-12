package Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1=new String("     Privet    ");
        String s2=new String("abcdefgabc");

        String s10=s2.substring(3);//Копирует часть из строки в новый объект
        System.out.println(s10);

        String s11=s2.substring(3,7);//Копирует часть из строки в новый объект
        System.out.println(s11);

        System.out.println(s1);
        String s12=s1.trim();//убирает боковые пробелы. Создает новую строку
        System.out.println(s12);

        String s14=s1.replace('r','s');//char
        System.out.println(s14);
        String s15=s1.replace("vet","vivka");//string
        System.out.println(s15);

        String s20="poka";
        String s21=s20.replace('k','r');
        System.out.println(s20==s21);

        String s22=s20.replace("r","k");
        System.out.println(s20==s22);

        String s3="Privet";
        String s31=" drug";
        System.out.println(s3+s31);


    }
}