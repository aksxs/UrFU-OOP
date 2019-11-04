package ru.ttcreate.semester3.lab3.ex2;

public class Main {
    public static void main(String[] args) {
        Superclass superclass = new Superclass("Текстовое поле суперкласса");
        System.out.println("Длинна строки суперкласса: " + superclass.getStrLength());

        superclass.set("Хей");
        System.out.println("Длинна строки суперкласса после set'тера: " + superclass.getStrLength());

        Subclass subclass = new Subclass(5,"Оп");
        System.out.println("Длинна строки подкласса: " + subclass.getStrLength());
    }
}
