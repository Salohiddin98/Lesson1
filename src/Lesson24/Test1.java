package Lesson24;

public class Test1 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        h.slockFire("Hand");
        h.help();
        
        System.out.println(h.a);
    }
}

class Employee {
    double salary = 100;
    String name = "Kolya";
    int age, exp;

    void eat() {
        System.out.println("Eat");
    }

    void sleep() {
        System.out.println("Sleep");
    }
}

class Teacher extends Employee implements Help_able {
    int usersNum;

    public void help() {
        System.out.println("Teacher is swimming");
    }

    public void slockFire(String s) {
        System.out.println("Teacher is slocking fire " + s);
    }

    void teach() {
        System.out.println("Teach");
    }

}

class Driver extends Employee implements Help_able, Swim_able {
    String carName;

    public void help() {
        System.out.println("Driver is swimming");
    }

    public void slockFire(String s) {
        System.out.println("Driver is slocking fire " + s);
    }

    public void swim() {
        System.out.println("Driver is swiming fire");
    }

    void drive() {
        System.out.println("Drive");
    }
}

interface Help_able {
    //Java 7 методы должны быть абстрактны (abstract писать не объ€зательно)
    void help();

    int a = 100;

    void slockFire(String s);

}

interface Swim_able {
    void swim();
}
