package ru.ttcreate.semester3.lab3.ex5;

public class Superclass {
    protected String superStr;

    public Superclass(String superStr) {
        this.superStr = superStr;
    }

    public void outInfo() {
        System.out.println("Имя класса: " + getClass().getName());
        System.out.println("Значение поля superStr: " + superStr);
    }
}
