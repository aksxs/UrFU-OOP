package ru.ttcreate.semester3.lab3.ex1;

public class Main {
    public static void main(String[] args) {
        Superclass superclass = new Superclass("Текст суперкласса");
        System.out.println(superclass.toString());

        Subclass subclass = new Subclass("Текст суперкласса из подкласса");
        System.out.println(subclass.toString());

        subclass = new Subclass("Текст суперкласса из подкласса", "Текст подкласса из подкласса");
        System.out.println(subclass.toString());
    }
}
