package Lesson18;

import java.util.Arrays;

public class Test5 {

    public static void maxMin(double array[]){
        double min=array[0],max=array[0];
        for (int i=0;i<array.length;i++){
            if (max<array[i]){max=array[i];}
            if (min>array[i]){min=array[i];}

        }
        System.out.println("Min="+min+"\nMax="+max);

    }
    public static void main(String[] args) {
        double array[] = {1, 9, 3, -8, 0, 5, 4, 1};
        maxMin(array);
        maxMin(new double[]{2.5,-1,17.9,-7.4});
    }
}
