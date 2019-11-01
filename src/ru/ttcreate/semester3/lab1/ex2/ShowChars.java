package ru.ttcreate.semester3.lab1.ex2;

public class ShowChars {
    static char charA = 'A';
    static char charB = 'D';

    public static void main(String[] args) {
        ShowChars.showChars();
    }

    public static void showChars() {
        for (char i = charA; i <= charB; i++) {
            System.out.println(i);
        }
    }
}
