package ru.ttcreate.semester3.lab2.ex5;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of 5 = " + getSum(5));
        System.out.println("Sum of 6 = " + getSumByRecursion(6));
    }

    private static int getSum(int value) {
        int result = 0;

        for (int i = 1; i <= value; i++) {
            result += Math.pow(i, 2);
        }

        return result;
    }

    private static int getSumByRecursion(int value) {
        if (value <= 0){
            return 0;
        } else {
            return (int) Math.pow(value, 2) + getSumByRecursion(value - 1);
        }
    }
}
