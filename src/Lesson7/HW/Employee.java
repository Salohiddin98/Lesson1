package Lesson7.HW;

class EmployeeTest{

    public static void main(String []args){
//        Employee emp = new Employee(1,"Ivanov",25);
        Employee emp1 = new Employee("Ivanovich",26);
        Employee emp2 = new Employee(1,"Sidorov",27,205.5,"Cyber Security");
//        Вывод с помощью методов
//        emp.showid(emp.id);
//        emp.showsurname(emp.surname);
        emp1.showid();
        emp1.showsurname();
        emp2.showid();
        emp2.showsurname();
//        emp2.showsalary(emp2.salary);


        System.out.println();
        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        System.out.println(emp2.id);
        System.out.println(emp2.surname);


    }
}
public class Employee{
    private Employee(int id2, String surname2, int age2){
        id=id2;
        surname=surname2;
        age=age2;
    }

     Employee(String surname2, int age2){
        surname=surname2;
        age=age2;
    }
    public Employee(int id2,String surname2, int age2,double salary2,String departament2){
        id=id2;
        surname=surname2;
        age=age2;
        salary=salary2;
        departament=departament2;
    }
    public void showid(){
        System.out.println(id);
    }
    public void showsurname(){
        System.out.println(surname);
    }
    public void showsalary(){
        System.out.println(salary);
    }

    int id;
    int age;
    public String surname;
    String departament;
    private double salary;

}

