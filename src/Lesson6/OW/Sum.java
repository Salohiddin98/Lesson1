package Lesson6.OW;

public class Sum{

    public static void main(String []args){
        SumTest num=new SumTest();
        int a=num.sum();
        System.out.println(a);
        a=num.sum(5);
        System.out.println(a);
        a=num.sum(5,3);
        System.out.println(a);
        a=num.sum(5,3,2);
        System.out.println(a);
        System.out.println();

    }
}
class SumTest{
    int sum(){
        return 0;
    }
    int sum(int a){
        return a;
    }
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
}