package ru.ttcreate.semester3.lab2.ex7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(
                "Encoded char array: " + Arrays.toString(encode(new char[]{'s', 't', 'r', 'i', 'n', 'g'}))
        );
    }

    private static int[] encode(char[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }

        return result;
    }
}
