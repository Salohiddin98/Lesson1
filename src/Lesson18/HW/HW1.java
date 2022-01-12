package Lesson18.HW;

public class HW1 {
   static int[] sort(int[] a){
        int temp;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
   static void show(int[]a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

}
class Test{
    public static void main(String[] args) {
        int array[]=new int[20];
        System.out.println("Неотсортироный Массив");
        for (int i=0;i<array.length;i++){
            array[i]=(-50+(int)(Math.random()*100));
        }
        HW1.show(array);
        HW1.sort(array);
        System.out.println("\nОтсортироный Массив");
        HW1.show(array);
    }

}

