package Lesson16;

public class Test8 {
    public static void main(String[] args) {


    String s1=new String("ok");
    String s2=new String("ok");

        System.out.println(s1==s2);//сравнивает адреса
        System.out.println(s1.equals(s2));//сравнивает объекты(содержимое)
        System.out.println();

        String s3="Hello";
        String s4="Hello";
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println();

        System.out.println(s1!=s2);//сравнивает адреса
        System.out.println(s3!=s4);//сравнивает адреса
        System.out.println();

        String s5="Kak Dela?";
        String s6="kak dela?";
        System.out.println(s5.equalsIgnoreCase(s6));//Сравнивает игнорируя регистр
        System.out.println();

        String x="privet";
        String y="privet".trim();
        System.out.println(x==y);

    }
}
