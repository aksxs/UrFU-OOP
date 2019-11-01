package ru.ttcreate.semester3.lab2.ex1;

class Main {
    private static StringCharValues stringCharValues = new StringCharValues();

    public static void main(String[] args) {
        showStringChar();

        stringCharValues.setValue('1');
        stringCharValues.setValue("some string");

        showStringChar();

        stringCharValues.setValue(new char[] {'2'});

        showStringChar();

        stringCharValues.setValue(new char[] {'s', 'o', 'm', 'e', ' ', 's', 't', 'r', 'i', 'n', 'g'});

        showStringChar();
    }

    public static void showStringChar() {
        System.out.println("String: " + stringCharValues.stringValue);
        System.out.println("Char: " + stringCharValues.charValue);
        System.out.println();
    }
}