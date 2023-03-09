package Lesson24.HW;

public class HW {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Artur");
        Speakable s = new Pingvin("Lolo");
        Animal a = new Lev("Simba");
        Mammal m1 = new Lev("Kira");
        System.out.println(m.name);
        m.eat();
        m.swim();
        m.sleep();
        System.out.println();
        s.speak();
        System.out.println();
        System.out.println(a.name);
        a.eat();
        a.sleep();
        System.out.println();
        System.out.println(m1.name);
        m1.eat();
        m1.sleep();
        m1.run();
        m1.speak();

    }
}

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    String name;

    Fish(String name) {
        super(name);
        this.name = name;

    }

    abstract void swim();

    void sleep() {
        System.out.println("Всегда интересно наблюдать, как спят рыбы");
    }
}

abstract class Bird extends Animal implements Speakable {
    String name;

    Bird(String name) {
        super(name);
        this.name = name;

    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(this.name + " говорит");
    }
}

abstract class Mammal extends Animal implements Speakable {
    String name;

    Mammal(String name) {
        super(name);
        this.name = name;

    }

    abstract void run();

    @Override
    public void speak() {
        Speakable.super.speak();
    }
}

class Mechenosec extends Fish {
    String name;

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void swim() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает");
    }

    @Override
    void eat() {
        System.out.println("Меченосец не хищьная рыба и она есть обычный рыбный корм");
    }

}

class Pingvin extends Bird {
    String name;

    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Пингвин любит есть рыбу");
    }

    @Override
    void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу");
    }

    @Override
    void fly() {
        System.out.println("Пингвины не умеют летать");
    }


    @Override
    public void speak() {
        super.speak();
        System.out.println("Пингвины не умеют петь как соловьи");
    }
}

class Lev extends Mammal {
    String name;

    Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Лев, как любой хищьник любит мясо");
    }

    @Override
    void sleep() {
        System.out.println("Большую часть дня лев спит");
    }

    @Override
    void run() {
        System.out.println("Лев не самая быстрая кошка");
    }
}

interface Speakable {
    default void speak() {
        System.out.println("Кто-то говорит");
    }
}