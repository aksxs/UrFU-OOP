package ru.ttcreate.semester3.lab2;

public class Lab2 {
    static char charA = 'A';
    static char charB = 'D';

    public static void main(String[] args) {
        Lab2.showChars();
    }

    public static void showChars() {
        for (char i = charA; i <= charB; i++) {
            System.out.println(i);
        }
    }
}
