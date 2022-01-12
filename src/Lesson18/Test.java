package Lesson18;

public class Test {
    public static void main(String[] args) {
//        int array[][]={{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(array[1][1]);

        //Объявление
    int [] arr1={1, 2, 3, 4, 5, 6, 7, 8};
    String [] arr2;
    double [][] arr3;

    //Задаем размер
//        arr1= new int[]
        arr2=new String[3];
        arr3=new double[4][];
        System.out.println(arr1[0]);
        System.out.println(arr3.length);

        int [][] arr10=new int[3][4];//В двумерном можно длину по y не указывать(динамическая)

        //Static initialization
        arr2 [0]="hello";
        arr2 [1]="hel";
        arr2 [2]="llo";

        arr10[0]=arr1;//вошли только элементы до 4 индекса
        System.out.println(arr10[0][4]);
    }
}
