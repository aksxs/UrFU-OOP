package ru.ttcreate.semester3.lab1.ex3;

public class SetIntegers {
    private static int int1;
    private static int int2;

    public static void main(String[] args) {
        SetIntegers var1 = new SetIntegers(5, 6);
    }

    public SetIntegers() {
        int1 = 1;
        int2 = 2;
    }

    public SetIntegers(int int1) {
        SetIntegers.int1 = int1;
        int2 = 2;
    }

    public SetIntegers(int int1, int int2) {
        SetIntegers.int1 = int1;
        SetIntegers.int2 = int2;
    }
}
