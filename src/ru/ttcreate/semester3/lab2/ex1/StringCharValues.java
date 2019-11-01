package ru.ttcreate.semester3.lab2.ex1;

public class StringCharValues {

    public String stringValue;
    public char charValue;

    public void setValue(char newValue) {
        charValue = newValue;
    }

    public void setValue(String newValue) {
        stringValue = newValue;
    }

    public void setValue(char[] newValues) {
        if (newValues.length == 1) {
            charValue = newValues[0];
        } else {
            stringValue = String.valueOf(newValues);
        }
    }
}