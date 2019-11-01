package ru.ttcreate.semester3.lab2.ex6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cutArray(new int[]{1, 3, 2, 7, 12, 33}, 3)));
        System.out.println(Arrays.toString(cutArray(new int[]{1, 3, 2, 7, 12, 33}, 10)));
    }

    private static int[] cutArray(int[] array, int size) {

        if (size > array.length) {
            return getArrayCopy(array);
        }

        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }

        return result;
    }

    private static int[] getArrayCopy(int[] array) {
        return array.clone();
    }
}
