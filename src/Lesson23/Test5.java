package Lesson23;

public class Test5 {
}

class Animal2{
   static String showName(){
        return "some Animal";
    }
    void showInfo(){
        System.out.println("Name of Animal:"+showName());
    }
}
class Cat extends Animal2{

    static String showName(){
        return "Tom";
    }

    void showInfoAboutCat(){
        System.out.println("Name of Cat:"+showName());
    }

    public static void main(String[] args) {
        Cat a=new Cat();
        a.showInfo();
        a.showInfoAboutCat();
    }

}
