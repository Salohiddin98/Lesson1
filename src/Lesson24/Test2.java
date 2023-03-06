package Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Jump j1 = new Human();
        Jump j2 = new Animal();
    }
}

class Human implements Jump {
    public void jump() {
        System.out.println("Human Jumps");
    }
}

class Animal implements Jump {
    public void jump() {
        System.out.println("Animal Jumps");
    }
}

interface Jump {
    void jump();
}

interface Walk extends Jump {
    void walk();
}