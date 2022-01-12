package Lesson10.p4;

import Lesson10.p1.A;
import Lesson10.p1.p2.*;
import Lesson10.p1.p2.p3.C;
import Lesson10.p4.p5.*;

import static Lesson10.p1.p2.B.*;

public class D {
    public static void main(String[] args) {

        A q = new A();
        System.out.println(q.str1);

        System.out.println(a);
        System.out.println(b);

        C c =new C();
        c.show();

        E e =new E();
        System.out.println(e.xyz);
    }
}
