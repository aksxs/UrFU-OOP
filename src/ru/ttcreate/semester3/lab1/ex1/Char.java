package ru.ttcreate.semester3.lab1.ex1;

public class Char {
    private static char c;

    public static void main(String[] args) {
        setC('Б');
        showValueAndCode();
    }

    public static int getCode() {
        return c;
    }

    public static void showValueAndCode() {
        System.out.println("Value: " + c);
        System.out.println("Code: " + getCode());
    }

    public static void setC(char value) {
        c = value;
    }
}