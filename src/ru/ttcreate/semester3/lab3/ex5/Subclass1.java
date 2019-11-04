package ru.ttcreate.semester3.lab3.ex5;

public class Subclass1 extends Superclass {
    protected int intA;

    public Subclass1(String superStr, int intA) {
        super(superStr);
        this.intA = intA;
    }

    public void outInfo() {
        System.out.println("Имя класса: " + getClass().getName());
        System.out.println("Значение поля superStr: " + superStr);
        System.out.println("Значение поля intA: " + intA);
    }
}
