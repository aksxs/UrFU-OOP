package ru.ttcreate.semester3.lab4;

public class Lab4 {
    private char charA;
    private int intB;

    public Lab4(double doubleC) {
        System.out.println("Char and code: " + (char)(int)doubleC + " " + (int)doubleC);

        // Получаем дробную часть из Double
        String doubleStr = String.valueOf(doubleC).substring(String.valueOf(doubleC).indexOf(".") + 1);
        System.out.println("Int: " + doubleStr.substring(0, 2)); // Вывод 2-х символов
    }

    public Lab4(char charA, int intB) {
        this.charA = charA;
        this.intB = intB;
    }

    public static void main(String[] args) {
        new Lab4(65.1267);
    }
}
