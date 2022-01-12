package Lesson15;

public class Test5 {
    public static void main(String[] args) {
        int money=100;
        do {
            System.out.println("Bet");
            System.out.println("You loose");
            money-=10;
        }
        while (money>50);
    }
}
