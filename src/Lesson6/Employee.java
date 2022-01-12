package Lesson6;

class EmployeeTest{

    public static void main(String []args){
        Employee emp = new Employee(1,"Ivanov",25);
        Employee emp1 = new Employee("Ivanovich",26);
        Employee emp2 = new Employee(1,"Sidorov",27,205.5,"Cyber Security");
        System.out.println(emp.age);
        System.out.println(emp1.age);
        System.out.println(emp2.age);


    }
}
class Employee{
    public Employee(int id2, String surname2, int age2){
        id=id2;
        surname=surname2;
        age=age2;
    }

    Employee(String surname2, int age2){
        surname=surname2;
        age=age2;
    }
    Employee(int id2,String surname2, int age2,double salary2,String departament2){
        id=id2;
        surname=surname2;
        age=age2;
        salary=salary2;
        departament=departament2;
    }
   public int id, age;
    String surname,departament;
    double salary;

}
