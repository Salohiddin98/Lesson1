package Lesson22;

public class Chelovek {
    final String pol;
  public Chelovek (String pol){
        this.pol=pol;
    }
    //Incapsulation

    private boolean clever;
    public boolean isClever(){
            return clever;
    }
    public void isClever(int i){
        if (i>=25){
            this.clever=true;
        }
        else {this.clever=false;}
    }

    private String name;
    public String getName(){
        return name;
    }
    public void setName(String s){
        this.name=s;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0)
            this.age = age;
    }

    private  int ves;

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        if (ves>0)
        this.ves = ves;
    }
}

class Test{
    public static void main(String[] args) {
        Chelovek c=new Chelovek("male");
        c.setName("Petya");
        c.setAge(25);
        c.setVes(65);
        c.isClever(c.getAge());
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getVes());
        System.out.println(c.isClever());


    }
}
