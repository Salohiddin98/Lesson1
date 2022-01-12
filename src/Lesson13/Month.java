package Lesson13;

import java.util.Scanner;

public class Month {

    static void MonthNum(int a) {
        switch (a) {
            case 1:case 3: case 5:case 7:case 8:case 10:case 12:
                System.out.println("В " + a + " месяце 31 день");break;
            case 4: case 6: case 9: case 11:
                System.out.println("В " + a + " месяце 30 дней");break;
            case 2:
                System.out.println("В " + a + " месяце 28 дней");break;
            default:
                System.out.println("Ошибка.Всего существует 12 месяце");
        }
    }

    public static void main(String[] args) {
    MonthNum(7);
    }
}
