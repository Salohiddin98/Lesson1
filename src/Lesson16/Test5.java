package Lesson16;

import java.util.Locale;

public class Test5 {
    public static void main(String[] args) {
        String s=null;
        s+="ok!";
        System.out.println(s);

        String s2="qwerty"+s;/* == */ String s3=s.concat(s2);//объединение строк
        System.out.println(s2);
        System.out.println(s3);

        s=s.toUpperCase(Locale.ROOT);
        System.out.println(s);
        s=s.toLowerCase(Locale.ROOT);
        System.out.println(s);

        boolean b=s.contains("!");//Содержитс ли !
        System.out.println(b);
    }
}
