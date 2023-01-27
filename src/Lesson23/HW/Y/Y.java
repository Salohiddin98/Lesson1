package Lesson23.HW.Y;

import Lesson23.HW.X.*;

public class Y extends X {
        Y(){}
    @Override
        public void abc(){
            System.out.println("Y");
        }
    public void def(){
        Y y=new Y();
        y.abc();
    }
    public void ghi(){
        X x=new Y();

    }

    public static void main(String[] args) {
       Y a=new Y();
        a.abc();
        a.def();
        a.ghi();
    }
    }


