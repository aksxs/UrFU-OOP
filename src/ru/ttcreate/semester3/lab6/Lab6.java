package ru.ttcreate.semester3.lab6;

public class Lab6 {
    private int min;
    private int max;

    public Lab6(int intA, int intB) {
        setMaxMin(intA, intB);
    }

    public static void main(String[] args) {
        System.out.println("Example 1:");
        Lab6 lab = new Lab6(60, 30);
        lab.showMaxMin();

        System.out.println("\nExample 2:");
        Lab6 lab2 = new Lab6(10, 30);
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
