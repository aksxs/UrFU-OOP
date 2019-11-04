package ru.ttcreate.semester3.lab3.ex3;

public class SubSubclass extends Subclass {
    public String strB;

    public SubSubclass(int intA, char charA, String strB) {
        super(intA, charA);
        this.strB = strB;
    }

    public void setSuper(int intA, char charA, String strB) {
        setSuper(intA, charA);
        this.strB = strB;
    }

    @Override
    public String toString() {
        return "SubSubclass{" +
                "intA='" + intA + '\'' +
                ", charA ='" + charA + '\'' +
                ", strB='" + strB + '\'' +
                '}';
    }
}
