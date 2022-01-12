package Lesson5;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gaz(int a){
        speed+=a;
        return speed;
    }

    int tormoz(int a){
        speed-=a;
        return speed;
    }

    void showinfo(){
        System.out.println("Цвет:"+color+ " Мотор:"+ engine+ " Скорость:"+speed);
    }
}
class Car2Test{
    public static void main(String[] args) {
        Car2 c1=new Car2();
        c1.color="White";
        c1.engine="V6";
        c1.speed=60;

        c1.showinfo();
        c1.gaz(20);
        c1.showinfo();
        c1.tormoz(40);
        c1.showinfo();
    }
}
