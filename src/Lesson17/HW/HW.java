package Lesson17.HW;

public class HW {
    static boolean ravenstvo(StringBuilder a,StringBuilder b){
        boolean x;
        String s1=new String(a);
        String s2=new String(b);

        x=s1.equals(s2);
        return x;
    }

    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("qwe");
        StringBuilder sb2=new StringBuilder("qwe");
        System.out.println(HW.ravenstvo(sb1,sb2));
    }
}
