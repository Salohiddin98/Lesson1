package Lesson22.HW;

public class Animal {
    static int eyes;
    Animal(){
        System.out.println("I am animal");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    void drink(){
        System.out.println("Animal drinks");
    }
}
class Pet extends Animal{
    String name;
    int tail=1,paw=4;

    Pet(){
        System.out.println("I am pet");
        this.eyes=2;
    }
    void run(){
        System.out.println("Pet runs");
    }
    void jump(){
        System.out.println("Pet jumps");
    }
}
class Dog extends Pet{
    Dog (String name){
        System.out.println("I am a dog and my name is:"+name);
    }
    void play(){
        System.out.println("Dog plays");
    }
}
class Cat extends Pet{
    Cat (String name){
        System.out.println("I am a cat and my name is:"+name);
    }
    void sleep(){
        System.out.println("Cat sleeps");
    }
}
class Test{
    public static void main(String[] args) {
        Dog d=new Dog("Grimm");
        Cat c=new Cat("Cheshir");
        System.out.println("Paws number of a dog="+d.paw);
        c.sleep();

    }
}


