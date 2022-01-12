package Lesson12;

public class Test10 {

    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = new String("bca");
        int a = 10,b=20;
        if (a < 20 && a == 10) {
            System.out.println("a=" + a);

        } else {
            System.out.println("qwerty");
        }
        int max=(a>b)?a:b;
        //условие?значение(если условие истина):значение(если условие ложное)
        System.out.println("max="+max);


        if (s1 == s2) {
            System.out.println("s1=s2");
        }
        if (s1.equals(s3))//equal метод существует у всех классов и нужен для сравнения
        {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
