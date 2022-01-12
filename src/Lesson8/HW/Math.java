package Lesson8.HW;

class Math {

    static double mult(double a, double b, double c){
        return a*b*c;
    }

    static void div(int a, int b){
        System.out.println("Целая часть="+(a/b)+" Остаток="+a%b);
    }

}

class MathTest{
    public static void main(String[] args) {
        System.out.println(Math.mult(2,4,5));
        Math.div(26,5);
        System.out.println(Math.mult(3,2,5));
        Math.div(16,5);
    }

}
