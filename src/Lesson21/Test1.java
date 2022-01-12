package Lesson21;

public class Test1 {
    //Повторение 20 уроков
    public static void main(String[] args) {
        int a=4;
        System.out.println((a<4?7:"privet"));

        String s1,s2;
        s1=new String("Privet");
        s2=new String("poka");
        s1=s2;
        String s3=s1;
        s1=null;
        System.out.println(s1+s2+s3);
    }

}
