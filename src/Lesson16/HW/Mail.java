package Lesson16.HW;

public class Mail {
    static void email(String s1){
        int a=0,b=0;
        String str="";

    for (int i=0;i<s1.length();i++){
        if (s1.charAt(i)=='@'){
            a=i;
        }
        else if(s1.charAt(i)=='.') {
            b = i;
            System.out.println(s1.substring(a+1,b).trim());
                  }
    }
    }

    public static void main(String[] args) {
        email("ya@yahoo.com; ma@mail.ru; gm@gmail.com; ");
    }

}
