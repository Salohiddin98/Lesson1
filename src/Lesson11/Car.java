package Lesson11;

public class Car {
    String color,engine;
    int doors;
    Car(String color, String engine, int doors){
        this.color=color;
        this.engine=engine;
        this.doors=doors;
    }

}
class CarTest{

    public static void doorsChange(Car c1){
        c1.doors=2;
    }
    public static void changeProp(Car c1,Car c2){
        String c3=c1.color;
        c1.color=c2.color;
        c2.color=c3;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Black","V6",4);
        Car c2 = new Car("Red","v8",6);
        CarTest c3 = new CarTest();

        System.out.println("Color:"+c1.color+" Engine:"+c1.engine+" Doors:"+c1.doors);
        System.out.println("Color:"+c2.color+" Engine:"+c2.engine+" Doors:"+c2.doors);
        System.out.println();

        doorsChange(c1);

        System.out.println("Color:"+c1.color+" Engine:"+c1.engine+" Doors:"+c1.doors);
        System.out.println("Color:"+c2.color+" Engine:"+c2.engine+" Doors:"+c2.doors);
        System.out.println();

        changeProp(c1,c2);

        System.out.println("Color:"+c1.color+" Engine:"+c1.engine+" Doors:"+c1.doors);
        System.out.println("Color:"+c2.color+" Engine:"+c2.engine+" Doors:"+c2.doors);
        System.out.println();


    }


}
