package Lesson16;

public class Car {
    String color,engine;
    Car(String color,String engine){
        this.color=color;
        this.engine=engine;
    }

    public Car abc(String cvet){
        Car c10=new Car(cvet,"v4");
        return c10;
    }

}
class CarTest{
    final static Car c =new Car("Red","V8");
    public static void main(String[] args) {
       // c =new Car(" "," ");
        //Нельзя менять адрес статичной ссылки, но можно менять содержимое ячейки
        //на которую она указывает
        c.color="Pink";

        Car c1= new Car("Red","V6");
        Car c2= c1.abc("Black");
        System.out.println(c2.color);
        System.out.println(c1.color);
        //Изменения внесенные методом отражены во 2 объекте
        System.out.println(c2.color);
    }
}
