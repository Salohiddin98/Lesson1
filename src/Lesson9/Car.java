package Lesson9;

public class Car {

    final int XYZ=25;
    int z=5;
    int Z=10;
    int $=35;
    int _Z=15;
    boolean qwe=true;


    String color;
    int a=10;
    String engine;
    static int count;

    public Car(String color, String engine){
    int x = 5;
    int y=x+10;
    //У локальных переменных нет значений по умолчанию
    this.count++;
    this.color=color;
    this.engine=engine;
    //This указывает переменные объекта(вне конструктора)
    }

    public static void changeA(int b){
    Car c = new Car("black","V8");
    c.a=b;
    }

//    public void showColor(){
//        System.out.println("Color="+color);
//        changeColor("red");
//    }
//    public void changeColor(String color3){
//        System.out.println("Color will be changed");
//        int cena=5000;
//        color=color3;
//        cena+=1000;
//        }

    void changeColor(String color){
        this.color=color;
        System.out.println(color);
    }

}

class CarTest{
    public static void main(String[] args) {
    Car c= new Car("Red","V6");
        System.out.println(c.color);
        c.changeColor("Black");
        System.out.println(c.color);
    }
}