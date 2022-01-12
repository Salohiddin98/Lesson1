package Lesson14;

public class Test4 {
    public void time(){
      OUTER: for (int chas=0;chas<=23;chas++){
            for (int min=0;min<=59;min++){
                for (int sec=0;sec<=59;sec++) {
                    System.out.println(chas + ":" + min + ":" + sec);
                    if(sec==59){break OUTER;}//OUTER - Имя цикла
                }
            }
        }
    }

    public static void main(String[] args) {
        Test4 t =new Test4();
        t.time();
    }
}
