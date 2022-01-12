package Lesson18.HW;

public class HW2 {
    static String[][] rand(String a[][]) {
    String s="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        for (int i = 0; i<a.length;i++ ) {
            for (int j=0;j<a[i].length;j++){
                a[i][j]=s.substring(j,j+5);
            }
        }
        return a;
    }
    static void classicShow(String a[][]){
        System.out.println("Стандартный вывод:");
        for (int i = 0; i<a.length;i++ ) {
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void requiredShow(String a[][]){
        System.out.println("Требуемый вывод");
        System.out.print("{ ");
        for (int i = 0; i<a.length;i++ ) {
            System.out.print("{");
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
                if(j!=a[i].length-1){
                    System.out.print(",");
                }
            }
            System.out.print("}");
            if(i!=a.length-1){
                System.out.print(",");
            }
        }
        System.out.println(" }");
    }

}
class Test12{
    public static void main(String[] args) {
    String [][]str=new String[5][];
    for (int i=0;i<5;i++){
        int temp=(int)(Math.random()*10 + 1);
        str[i]=new String[temp];
    }
    HW2.rand(str);
    HW2.classicShow(str);
    System.out.println();
    HW2.requiredShow(str);

    }
}