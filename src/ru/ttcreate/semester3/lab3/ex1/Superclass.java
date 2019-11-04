package ru.ttcreate.semester3.lab3.ex1;

public class Superclass {
    private String superStr;

    public Superclass(String superStr) {
        this.superStr = superStr;
    }

    public String getSuperStr() {
        return superStr;
    }

    @Override
    public String toString() {
        return "Superclass{" +
                "superStr='" + superStr + '\'' +
                '}';
    }
}
