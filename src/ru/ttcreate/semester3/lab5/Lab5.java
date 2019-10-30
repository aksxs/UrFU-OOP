package ru.ttcreate.semester3.lab5;

public class Lab5 {
    private int intA;

    public Lab5(int intA) {
        setIntA(intA);
    }

    public static void main(String[] args) {
        Lab5 lab5Object = new Lab5(88);
        lab5Object.checkIntMore100();
    }

    public void setIntANull() {
        this.intA = 0;
    }

    public void setIntA(int intA) {
        if (intA > 100) {
            this.intA = 100;
        } else {
            this.intA = intA;
        }
    }

    public void checkIntMore100() {
        if (intA > 100) {
            System.out.println("Число больше 100");
        }

        System.out.println("Число меньше или равно 100");;
    }
}
