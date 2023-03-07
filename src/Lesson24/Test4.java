package Lesson24;

public class Test4 {
}

interface I2 {
    static void show() {
        System.out.println("Show");
    }
}

class Z1  {
    public static void main(String[] args) {
        //нельз€ обратитьс€ к статичному методу по названию класса        Z1.show()
        //    Ќо можно по имени интерфейса, даже если он не имплементирован.
        I2.show();
    }
}
