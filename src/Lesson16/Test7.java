package Lesson16;

import java.util.Locale;

public class Test7 {
    public static void main(String[] args) {
        String s="Чтоб мудро жизнь прожить, знать надобно немало,Два важных правила запомни для начала:" +
                "Ты лучше голодай, чем что попало есть,И лучше будь один, чем вместе с кем попало.";
        String s2=s.toUpperCase(Locale.ROOT);
        System.out.println(s);
        char c1,c2;
        for (int i=0;i<s.length();i++){
            c1=s.charAt(i);
            c2=s2.charAt(i);
            if (c1!=',' && c1!=':' && c1!=' ' && c1!='.' && c1==c2){
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
    }
}
