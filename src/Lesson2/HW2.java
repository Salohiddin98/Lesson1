package Lesson2;

public class HW2 {
    public static void main(String[] args) {
        byte b1=12,b2=0b1100, b3=014, b4=0xC;
        System.out.println(b1+" "+b2+" "+b3+" "+b4);

        short s1=-1300,s2=-0b10100010100, s3=-02424, s4=-0x514;
        System.out.println(s1+" "+s2+" "+s3+" "+s4);

        int i1=0, i2=0b0, i3=0, i4=0x0;
        System.out.println(i1+" "+i2+" "+i3+" "+i4);

        long l1=123456789, l2=0b111010110111100110100010101, l3=0726746425, l4=0x75BCD15;
        System.out.println(l1+" "+l2+" "+l3+" "+l4);

        float f1=3.14f, f2=6.28f;
        double d1=1, d2=3.0;
        boolean bool1=false, bool2=true;
        System.out.println(f1+" "+f2+" "+d1+" "+d2+" "+bool1+" "+bool2);

        char c1='A',c2='\u0041', c3=65;
        System.out.println(c1+" "+c2+" "+c3+" ");
    }
}
