package ru.ttcreate.semester3.lab3.ex5;

public class Main {
    public static void main(String[] args) {
        Superclass superclass = new Superclass("Хеллоу super");
        Subclass1 subclass1 = new Subclass1(superclass.superStr, 2);
        Subclass2 subclass2 = new Subclass2(superclass.superStr, 'S');
        Superclass superSubclass1 = new Subclass1(superclass.superStr, 2);

        superclass.outInfo();
        System.out.println();
        subclass1.outInfo();
        System.out.println();
        subclass2.outInfo();
        System.out.println();
        superSubclass1.outInfo();
    }
}
