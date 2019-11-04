package ru.ttcreate.semester3.lab3.ex2;

public class Superclass {
    private String strStr;

    public Superclass(String strStr) {
        this.strStr = strStr;
    }

    public int getStrLength() {
        return strStr.length();
    }

    public void set() {
        strStr = "Строка по умолчанию";
    }

    public void set(String superStr) {
        this.strStr = superStr;
    }
}
