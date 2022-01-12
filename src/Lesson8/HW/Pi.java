package Lesson8.HW;

public class Pi {
    static final double pi=3.14;
    double S(double a){
        return a*pi*pi;
    }
    static double len(double a){
        return 2*pi*a;
    }
    void show(double a,double b, double c){
        System.out.println("Radius="+a);
        System.out.println("S="+b);
        System.out.println("l="+c);
    }

}
class PiTest{
    public static void main(String[] args) {
        Pi x = new Pi();
        double rad=3,S,l;
        S=x.S(rad);
        l=Pi.len(rad);
        x.show(rad,S,l);

    }
}
