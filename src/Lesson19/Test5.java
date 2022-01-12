package Lesson19;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {0, 6, 4, 1};
        for (int a : arr) {
        a=3;//Не может сменить значение элементов массива
        }
        for (int a : arr) {
            System.out.print(a+" ");
        }

        System.out.println();

        StringBuilder sb1=new StringBuilder("Privet");
        StringBuilder sb2=new StringBuilder("Poka");
        StringBuilder sb3=new StringBuilder("Ok");

        StringBuilder []array={sb1,sb2,sb3};

        for (StringBuilder sb:array){
            sb=new StringBuilder("Hi");
        }

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        for (StringBuilder sb:array){
            sb.append(" Java");
        }

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
