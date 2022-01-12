package Lesson5.HW5;

public class Student{
    int num,year;
    float eco,math,lang;
    String name,surname;
}


 class StudentTest{

    void sred(Student st){
        double sredOcen=((st.eco+st.math+st.lang)/3);
        System.out.println("Srednee="+st.name+" "+st.surname+":"+sredOcen);
//        return sredOcen;
    }


    public static void main(String []args){
        Student Odil = new Student();
        Student Saloh = new Student();
        Student Adham = new Student();

        Odil.num=1;
        Odil.year=2018;
        Odil.name="Odil";
        Odil.surname="Olimjonov";
        Odil.eco=5;
        Odil.math=4;
        Odil.lang=5;

        Saloh.num=2;
        Saloh.year=2018;
        Saloh.name="Saloh";
        Saloh.surname="Rahidov";
        Saloh.eco=4;
        Saloh.math=4;
        Saloh.lang=4;

        Adham.num=3;
        Adham.year=2018;
        Adham.name="Adham";
        Adham.surname="Unknown";
        Adham.eco=3;
        Adham.math=4;
        Adham.lang=5;

        System.out.println(Odil.name+" "+Odil.surname+" = "+ (Odil.eco+Odil.math+Odil.lang)/3);
        System.out.println(Saloh.name+" "+Saloh.surname+" = "+ (Saloh.eco+Saloh.math+Saloh.lang)/3);
        System.out.println(Adham.name+" "+Adham.surname+" = "+ (Adham.eco+Adham.math+Adham.lang)/3);

        StudentTest sTest= new StudentTest();
        sTest.sred(Odil);
        sTest.sred(Saloh);
        sTest.sred(Adham);


    }
}