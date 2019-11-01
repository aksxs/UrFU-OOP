package ru.ttcreate.semester3.lab2.ex9;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] array = {"В", "результате", "вызова", "метода", "элементы", "массива", "попарно",
                "меняются", "местами"};

        System.out.println("Array before reverse: " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Array after reverse: " + Arrays.toString(array));
    }

    private static void reverseArray(String[] array) {
        String tmp;
        int count = (array.length / 2) % 2 == 0 ? array.length / 2 : (array.length / 2) - 1;
        for (int i = 0; i < count; i++) {
            tmp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = tmp;
        }
    }
}
