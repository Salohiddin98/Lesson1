package Lesson4;

public class Car {
Car(){
    System.out.println("Objec created");
    color="blue";
    engine="v12";
}
Car(String cvet, String motor){
    color=cvet;
    engine=motor;

}


    String color;
    String engine;

}

class CarTest{
    public static void main(String[] args) {
        Car car1 = new Car("yellow","v4");
        Car car2 = new Car();
        System.out.println(car1.color + " " +car1.engine);
        System.out.println(car2.color + " " +car2.engine);
    }
}
