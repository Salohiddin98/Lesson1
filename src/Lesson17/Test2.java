package Lesson17;

public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("4567");
        StringBuilder sb2=new StringBuilder("45");
        sb2=sb2.append("6").append("7");
        System.out.println("sb1="+sb1);
        System.out.println("sb2="+sb2);

//         StringBuilder-для однопоточных
//         StringBuffer-для многопоточных

        StringBuilder sb3=new StringBuilder("Hello");
        StringBuffer sb4=new StringBuffer("Good Bye!");

        String s1=new String(sb3);
        String s2=new String(sb4);
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));// равно как ==
    }
}
