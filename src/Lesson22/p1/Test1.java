package Lesson22.p1;
import Lesson22.Chelovek;
public class Test1 {
    public static void main(String[] args) {
        Chelovek c=new Chelovek("male");
        c.setName("Kolya");
        c.setAge(20);
        c.setVes(80);
        c.isClever(c.getAge());
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getVes());
        System.out.println(c.isClever());
    }
}
