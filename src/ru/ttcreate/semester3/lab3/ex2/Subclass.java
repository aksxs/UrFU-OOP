package ru.ttcreate.semester3.lab3.ex2;

public class Subclass extends Superclass {
    public int intInt;

    public Subclass(int intInt, String strStr) {
        super(strStr);
        this.intInt = intInt;
    }

    public void set() {
        super.set();
    }

    public void set(String strStr) {
        super.set(strStr);
    }

    public void set(int intInt) {
        this.intInt = intInt;
    }

    public void set(String strStr, int intInt) {
        super.set(strStr);
        this.intInt = intInt;
    }
}
