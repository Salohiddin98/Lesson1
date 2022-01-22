package Lesson23;

public class Test6 {
    public static void main(String[] args) {
        E c1= new G();
        c1.abc(new F());
    }
}
class E{
    void abc(E e){
        System.out.println("E");
    }
}
class F extends E{
    void abc(F f1){
        System.out.println("F");
    }
}

class G extends F{
    void abc(F f2){
        System.out.println("G");
    }
}