package ru.ttcreate.semester3.lab2.ex8;

public class Main {

    public static void main(String[] args) {
        System.out.println("Average: " + getAverage(new int[] {1, 4, 1, 6, 32, 5, 19}));
    }

    private static int getAverage(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return sum / array.length;
    }
}
