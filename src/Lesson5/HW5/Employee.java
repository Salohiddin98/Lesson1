package Lesson5.HW5;

public class Employee {
    int id,age;
    double salary;
    String surname,departament;
    Employee(int id2,int age2, double salary2,String surname2,String departament2){
        id=id2;
        age=age2;
        salary=salary2;
        surname=surname2;
        departament=departament2;
    }
    void plus(Employee st){
        System.out.println(st.surname+"`s salary before:"+st.salary);
        salary*=2;
        System.out.println(st.surname+"`s salary after:"+st.salary);
    }
}
class EmpliyeeTest{
    public static void main(String[] args) {
        Employee Saloh=new Employee(1,23,200,"Rashidov","Cyber Security");
        Employee Odil=new Employee(2,24,2000,"Olimjonov","Front End");
        Saloh.plus(Saloh);
        Odil.plus(Odil);
    }

}
