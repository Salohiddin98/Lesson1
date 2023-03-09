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
        System.out.println("������ ��������� ���������, ��� ���� ����");
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
        System.out.println(this.name + " �������");
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
        System.out.println("��������� �������� ����, ������� ������ �������");
    }

    @Override
    void eat() {
        System.out.println("��������� �� ������� ���� � ��� ���� ������� ������ ����");
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
        System.out.println("������� ����� ���� ����");
    }

    @Override
    void sleep() {
        System.out.println("�������� ���� ���������� ���� � �����");
    }

    @Override
    void fly() {
        System.out.println("�������� �� ����� ������");
    }


    @Override
    public void speak() {
        super.speak();
        System.out.println("�������� �� ����� ���� ��� �������");
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
        System.out.println("���, ��� ����� ������� ����� ����");
    }

    @Override
    void sleep() {
        System.out.println("������� ����� ��� ��� ����");
    }

    @Override
    void run() {
        System.out.println("��� �� ����� ������� �����");
    }
}

interface Speakable {
    default void speak() {
        System.out.println("���-�� �������");
    }
}