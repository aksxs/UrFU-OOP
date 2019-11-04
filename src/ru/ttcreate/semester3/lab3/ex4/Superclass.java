package ru.ttcreate.semester3.lab3.ex4;

public class Superclass {
    public char charA;

    public Superclass(Superclass superclass) {
        this.charA = superclass.charA;
    }

    public Superclass(char charA) {
        this.charA = charA;
    }
}
