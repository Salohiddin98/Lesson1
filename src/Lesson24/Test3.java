package Lesson24;

public class Test3 {
}

interface I1 {
    void abc();

    //default ������ �������� ����� ���� � � ������ ��� �� ����� ��������������
    default void show() {
        System.out.println("Show");
    }
}

class Z implements I1 {
    public void abc() {
        System.out.println("abc func");
    }
}