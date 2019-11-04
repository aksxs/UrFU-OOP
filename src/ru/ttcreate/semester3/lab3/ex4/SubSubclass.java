package ru.ttcreate.semester3.lab3.ex4;

public class SubSubclass extends Subclass {
    public int intA;

    public SubSubclass(Subclass subclass) {
        super(subclass.charA, subclass.strB);
    }

    public SubSubclass(char charA, String strB, int intA) {
        super(charA, strB);
        this.intA = intA;
    }
}
