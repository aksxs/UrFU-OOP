package ru.ttcreate.semester3.lab2.ex3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Max: " + MinMaxAverage.getMax(5, 1, 3, 73, 12));
        System.out.println("Min: " + MinMaxAverage.getMin(5, 1, 3, 73, 12));
        System.out.println("Min: " + MinMaxAverage.getMin(5));
        System.out.println("Average: " + MinMaxAverage.getAverage(5, 1, 3, 73, 12));
    }
}
