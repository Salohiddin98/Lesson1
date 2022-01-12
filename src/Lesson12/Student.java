package Lesson12;

public class Student {
    String name;
    int course;
    double grade;
    Student(String name, int course, double grade){
        this.name=name;
        this.course=course;
        this.grade=grade;
    }
    static void check(int c1, int c2, double g1, double g2){
        if (c1==c2 && g1==g2){
            System.out.println("Studenti ravni");
        }
        else {
            System.out.println("Studenti ne ravni");
        }
    }

    static void NestedCheck(int c1, int c2, double g1, double g2,String n1, String n2){
    if (c1==c2){
        if (g1==g2){
            if(n1.equals(n2)){
                System.out.println("All equal");
            }
            else {
                System.out.println("Name not equal");
            }
        }
        else {
            System.out.println("Grade not equal");
        }

    }
    else {
        System.out.println("Course not equal");
    }
    }


    public static void main(String[] args) {
        Student st1 = new Student("Ivan",3,9.5);
        Student st2 = new Student("Petr",1,5.5);

        System.out.println("Name:"+st1.name+" Course:"+st1.course+" Grade="+st1.grade);
        System.out.println("Name:"+st2.name+" Course:"+st2.course+" Grade="+st2.grade);

        check(st1.course, st2.course, st1.grade,st2.grade);
        NestedCheck(st1.course, st2.course, st1.grade,st2.grade, st1.name,st2.name);
    }
}

