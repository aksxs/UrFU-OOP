package ru.ttcreate.semester3.lab3.ex4;

public class Subclass extends Superclass {
    public String strB;

    public Subclass(Superclass superclass) {
        super(superclass.charA);
    }

    public Subclass(char charA, String strB) {
        super(charA);
        this.strB = strB;
    }
}
