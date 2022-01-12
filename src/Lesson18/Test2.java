package Lesson18;

public class Test2 {
    static String s;
    public static void main(String[] args) {
        //Exceptions

        //1 Exception
        int []array=new int[-3];

        //2 Exception
        for (int i=0;i<array.length+1;i++){
            array[i]=i;
        }

        //3 Exception
        int [][] array2=new int[3][];
        System.out.println(array2[0][2]);

        System.out.println(s);


    }
}
