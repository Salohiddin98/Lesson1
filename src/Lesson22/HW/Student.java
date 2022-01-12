package Lesson22.HW;

public class Student {
   private StringBuilder name;
   private int cousre,grade;
   void setName(StringBuilder name){
        if (name.length()>3){
            this.name=name;
        }
    }
    StringBuilder getName(){
        return name;
    }
    void setCousre(int cousre){
        if(1<=cousre && cousre<=10){
            this.cousre=cousre;
        }
    }
    int getCousre(){
        return cousre;
    }
    void setGrade(int grade){
        if(1<=grade && grade<=4){
            this.grade=grade;
        }
    }
    int getGrade(){
        return grade;
    }
    void showInfo(StringBuilder name,int cousre,int grade){
        System.out.println(name+" "+cousre+" "+grade);
    }

}

class TestStudent{
    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student();
        st1.setName(new StringBuilder("Salohiddin"));
        st1.setCousre(10);
        st1.setGrade(4);
        st2.setName(new StringBuilder("Odil"));
        st2.setCousre(12);
        st2.setGrade(5);
        st1.showInfo(st1.getName(),st1.getCousre(),st1.getGrade());
        st2.showInfo(st2.getName(),st2.getCousre(),st2.getGrade());
    }
}