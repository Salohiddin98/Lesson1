package Lesson23;

public class Test3 {
    void abc(Animal a){
        System.out.println("A");
    }
    void abc(Mouse a){
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test3 t=new Test3();
        Animal an=new Mouse();
        t.abc(an);
        an.getName();
    }
}
class Animal{
    void getName(){
        System.out.println("animal");
    }
}

class Mouse extends Animal {
    void getName(){
        System.out.println("Mouse");
    }

}