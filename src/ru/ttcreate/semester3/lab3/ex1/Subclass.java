package ru.ttcreate.semester3.lab3.ex1;

public class Subclass extends Superclass {
    private String subStr;

    public Subclass(String superStr) {
        super(superStr);
    }

    public Subclass(String superStr, String subStr) {
        super(superStr);
        this.subStr = subStr;
    }

    @Override
    public String toString() {
        return "Subclass{" +
                "superStr='" + getSuperStr() + '\'' +
                "\nsubStr='" + subStr + '\'' +
                '}';
    }
}
