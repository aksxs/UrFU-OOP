package ru.ttcreate.semester3.lab1.ex4;

public class SplitDouble {
    private char charA;
    private int intB;

    public SplitDouble(double doubleC) {
        System.out.println("Char and code: " + (char)(int)doubleC + " " + (int)doubleC);

        // Получаем дробную часть из Double
        String doubleStr = String.valueOf(doubleC).substring(String.valueOf(doubleC).indexOf(".") + 1);
        System.out.println("Int: " + doubleStr.substring(0, 2)); // Вывод 2-х символов
    }

    public SplitDouble(char charA, int intB) {
        this.charA = charA;
        this.intB = intB;
    }

    public static void main(String[] args) {
        new SplitDouble(65.1267);
    }
}
