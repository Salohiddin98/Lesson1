package Lesson6.OW;

class EmplTest{

    public static void main(String []args){
        Employee2 emp0 = new Employee2(1,"Ivanov",25);
        Employee2 emp1 = new Employee2("Ivanovich",26);
        Employee2 emp2 = new Employee2(2,"Sidorov",27,205.5,"Cyber Security");
        System.out.println(emp0.id+" "+emp0.age+" "+emp0.surname);
        System.out.println(emp1.surname+" "+emp1.age);
        System.out.println(emp2.id+" "+emp2.surname+" "+emp2.age+" "+emp2.salary+" "+emp2.departament);


    }
}
class Employee2{
    Employee2(int id2,String surname2, int age2){
        this(id2,surname2,age2,0.0,null);
       /* 2 метод.
           Берем как основу конструктор с самым большим количеством параметров  */
    }


    Employee2(String surname3, int age3){
        this(0,surname3,age3,0.0,null);
    }
    Employee2(int id4,String surname4, int age4,double salary4,String departament4){
        id=id4;
        surname=surname4;
        age=age4;
        salary=salary4;
        departament=departament4;
    }
    int id, age;
    String surname,departament;
    double salary;

}