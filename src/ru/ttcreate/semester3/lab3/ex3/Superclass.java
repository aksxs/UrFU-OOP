package ru.ttcreate.semester3.lab3.ex3;

public class Superclass {
    public int intA;

    public Superclass(int intA) {
        this.intA = intA;
    }

    public void setSuper(int intA) {
        this.intA = intA;
    }

    @Override
    public String toString() {
        return "Superclass{" +
                "intA=" + intA +
                '}';
    }
}
