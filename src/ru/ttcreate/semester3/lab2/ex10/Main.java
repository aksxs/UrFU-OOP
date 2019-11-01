package ru.ttcreate.semester3.lab2.ex10;

import java.util.Arrays;

public class Main {

    private final static int MIN_INDEX = 0;
    private final static int MAX_INDEX = 1;

    public static void main(String[] args) {
        int[] array = {2, 44, 12, 64, 11, 547, -3, 8, 2, 0};
        int[] minMax = getMinMax(array);

        System.out.println("Array: " + Arrays.toString(array) + "\n");

        System.out.println("Max of array: " + minMax[MAX_INDEX]);
        System.out.println("Min of array: " + minMax[MIN_INDEX]);
    }

    private static int[] getMinMax(int ... values) {
        if (values.length == 0) {
            return new int[]{};
        }

        int[] result = {values[0], values[0]};

        for (int value : values) {
            if (value < result[MIN_INDEX]) {
                result[MIN_INDEX] = value;
            }

            if (value > result[MAX_INDEX]) {
                result[MAX_INDEX] = value;
            }
        }

        return result;
    }

}
