package ru.ttcreate.semester3.lab2.ex3;

public class MinMaxAverage {

    public static int getMin(int ... values) {
        int result = values[0];

        for (int v : values) {
            if (v < result) {
                result = v;
            }
        }

        return result;
    }

    public static int getMax(int ... values) {
        int result = 0;

        for (int v : values) {
            if (v > result) {
                result = v;
            }
        }

        return result;
    }

    public static double getAverage(int ... values) {
        int sum = 0;

        for (int v : values) {
            sum += v;
        }

        return sum / values.length;
    }

}
