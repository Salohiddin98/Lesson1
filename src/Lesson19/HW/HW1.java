package Lesson19.HW;

public class HW1 {
    static String[] abc(String[]... arr){
        int length=0;
        for (String[]arr1:arr){
            length+= arr1.length;
        }
        String[]target=new String[length];
        int count=0;
        for (String[] arr1:arr){
            for (String s:arr1){
                target[count]=s;
                count++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] target=abc(new String[]{"qwe","ewq","we"},new String[]{"asd","dsa","ds"});
        for (String s:args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals((target[i]))) {
                    target[i] = null;
                }
            }
        }
        for (String s:target){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}