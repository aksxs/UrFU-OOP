package ru.ttcreate.semester3.lab3.ex3;

public class Subclass extends Superclass {
    public char charA;

    public Subclass(int intA, char charA) {
        super(intA);
        this.charA = charA;
    }

    public void setSuper(int intA, char charA) {
        setSuper(intA);
        this.charA = charA;
    }

    @Override
    public String toString() {
        return "Subclass{" +
                "intA='" + intA + '\'' +
                ", charA='" + charA + '\'' +
                '}';
    }
}
