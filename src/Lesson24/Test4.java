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
        //������ ���������� � ���������� ������ �� �������� ������        Z1.show()
        //    �� ����� �� ����� ����������, ���� ���� �� �� ���������������.
        I2.show();
    }
}
