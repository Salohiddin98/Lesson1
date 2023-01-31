package Lesson18;

public class  Test1 {
    public static void main(String[] args) {
        String [] array1;
        int [][] array2;

        array1=new String[3];
        array2=new int[3][];

        //Dynamic initialization;
        for (int i=0; i<array1.length;i++){
            array1[i]="privet"+i;
            System.out.println(array1[i]);
        }
        System.out.println();

        array2[0]=new int[5];
        array2[1]=new int[15];
        array2[2]=new int[7];

        for (int i=0;i<array2.length;i++){
            for (int j=0;j<array2[i].length;j++){
            array2[i][j]=i+j;
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }
        int []a,b;//a and b -arrays
        int c[],d;//c-array d-variable
        d=5;
        int e[],f[][];//e-1d array, f-2d array
        int []g,h[][];//g-1d array, f-3d array

    }
}
