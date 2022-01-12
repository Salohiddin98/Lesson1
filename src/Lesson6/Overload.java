package Lesson6;

class HelloWorld{

    public static void main(String []args){
        Overload m=new Overload();

        int a=m.sum(2,5);
        System.out.println(a);
        String b=m.sum("Privet ","moy drug");
        System.out.println(b);
    }
}

class Overload{
    public  int sum(int i1,int i2){
        return i1+i2;
    }
    protected  String sum(String s1,String s2){
        return s1+s2;
    }
}
