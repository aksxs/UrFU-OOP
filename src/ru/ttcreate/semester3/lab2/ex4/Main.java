package ru.ttcreate.semester3.lab2.ex4;

public class Main {
    public static void main(String[] args) {
        System.out.println("6!! = " + getFactorial(6));
        System.out.println("5!! = " + getFactorialByRecursion(5));
    }

    private static int getFactorial(int value) {
        int result = 1;
        for (int i = (value % 2 == 0) ? 2 : 1; i <= value; i += 2) {
            result *= i;
        }

        return result;
    }

    private static int getFactorialByRecursion(int value) {
        if (value <= 1) {
            return 1;
        } else {
            return value * getFactorialByRecursion(value - 2);
        }
    }
}
