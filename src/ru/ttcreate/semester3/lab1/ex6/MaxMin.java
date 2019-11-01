package ru.ttcreate.semester3.lab1.ex6;

public class MaxMin {
    private int min;
    private int max;

    public MaxMin(int intA, int intB) {
        setMaxMin(intA, intB);
    }

    public static void main(String[] args) {
        System.out.println("Example 1:");
        MaxMin lab = new MaxMin(60, 30);
        lab.showMaxMin();

        System.out.println("\nExample 2:");
        MaxMin lab2 = new MaxMin(10, 30);
        lab2.showMaxMin();
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMaxMin(int intA, int intB) {
        if (intA > intB) {
            this.max = intA;
            this.min = intB;
        } else {
            this.max = intB;
            this.min = intA;
        }
    }

    public void showMaxMin() {
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
