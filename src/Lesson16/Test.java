package Lesson16;

public class Test {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3="Hell";
        String s4="Hell ";
        String s5="Hel";
        System.out.println(System.identityHashCode(s1) + " " + System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3) + " " + System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s5));
        System.out.println(s1==s2);//сравнивает адреса
        System.out.println(s1.equals(s2));//сравнивает содержимое
    }
}
