package Lesson19;

public class Test2 {
    static void sum(int a,int b){
        System.out.println(a+b);
    }
    static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void sum(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
    static void summa(int ... a){//равносильно массиву
        //рассчитан на любое количество аргуменов
        //алтернатива перегрузке
        int summa=0;
        for (int i=0;i<a.length;i++){
        summa+=a[i];
        }
        }
    static void array(int[] ... array){
        //vararg для массива.
    }

    public static void main(String[] args) {
        summa(5,6,7,8,9,10);
        summa(new int[]{1,2,3,4,5,6});
    }
}

