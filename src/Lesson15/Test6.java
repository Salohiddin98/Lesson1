package Lesson15;

public class Test6 {
    public static void main(String[] args) {
        int chas=0;
       OUTER:
       do {
            int min=0;

            INNER:
            while (min<60){
                System.out.println(chas+":"+min);
                min++;
            }
            chas++;
        }
       while (chas<24);
    }
}
