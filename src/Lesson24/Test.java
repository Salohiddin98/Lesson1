package Lesson24;

public class Test {
    public static void main(String[] args) {
    Figura f1=new Kvadrat();
        System.out.println(f1.kolichestvoStoron);
        f1.ploshad();
        f1.perimetr();
    }
}
abstract class Figura{
    int kolichestvoStoron=0;
  abstract   void perimetr();
   abstract void ploshad();
   void showInfo(){
       System.out.println("Eto Figura");
   }
}
class Kvadrat extends Figura{
    int kolichestvoStoron=4;
    int storona1=10;
    void perimetr(){
        System.out.println(kolichestvoStoron*4);
    }
    void ploshad(){
        System.out.println(storona1*storona1);
    }
}
class Pryamougolnik extends Figura{
    int kolichestvoStoron=4;
    int storona1=8;
    int storona2=5;
    void perimetr(){
        System.out.println(storona1*storona2*2);
    }
    void ploshad(){
        System.out.println(storona1*storona2);
    }
}
class Okrujnost extends Figura{
    int kolichestvoStoron=0;
    int radius=3;
    void perimetr(){
        System.out.println(2*Math.PI*radius);
    }
    void ploshad(){
        System.out.println(Math.PI*radius*radius);
    }
}