package ru.ttcreate.semester3.lab3.ex5;

public class Subclass2 extends Superclass {
    protected char charA;

    public Subclass2(String superStr, char charA) {
        super(superStr);
        this.charA = charA;
    }

    public void outInfo() {
        System.out.println("Имя класса: " + getClass().getName());
        System.out.println("Значение поля superStr: " + superStr);
        System.out.println("Значение поля charA: " + charA);
    }
}
