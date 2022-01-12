package Lesson19;

public class Test3 {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
//        for (int i=0;i<array.length;i++){
//            System.out.print(array[i]+" ");
//        }
        System.out.println();

        for (int a :array){//foreach
            //работает одновременно только с 1 массивом
            System.out.print(a+" ");
        }

        System.out.println();

        String []s={"Rashidov","Olimjonov","Abdulhakimov"};
        String []s2={"Math","Programming"};

        for (String a:s){
            for (String b:s2){
                System.out.println(a+" "+b);
            }
        }
    }
}
