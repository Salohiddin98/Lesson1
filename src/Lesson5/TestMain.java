package Lesson5;

class Test{
    int summa(int a,int b,int c){
        int result;
        result=a+b+c;
        return result;

    }
    int arif(int a1,int b1, int c1){
        int result2;
        result2 = summa(a1,b1,c1)/3;
        return result2;
    }

}
public class TestMain{
    public static void main(String []args){
        Test t= new Test();//задача конструктора-создать объект t
        //Test-тип данных, второй Test-вызов конструктора
        //Название конструктора всегда совпадает с название класса.
        int a=t.summa(5,10,15);
        System.out.println(a);
        System.out.println(t.summa(3,3,6));
        System.out.println(t.arif(9,3,6));

    }
}
