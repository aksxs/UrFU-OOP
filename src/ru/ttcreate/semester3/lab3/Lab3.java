package ru.ttcreate.semester3.lab3;

public class Lab3 {
    private static int int1;
    private static int int2;

    public static void main(String[] args) {
        Lab3 var1 = new Lab3(5, 6);
    }

    public Lab3() {
        int1 = 1;
        int2 = 2;
    }

    public Lab3(int int1) {
        Lab3.int1 = int1;
        int2 = 2;
    }

    public Lab3(int int1, int int2) {
        Lab3.int1 = int1;
        Lab3.int2 = int2;
    }
}
