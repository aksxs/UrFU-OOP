package ru.ttcreate.semester3.lab1.ex5;

public class IntegerMore100 {
    private int intA;

    public IntegerMore100(int intA) {
        setIntA(intA);
    }

    public static void main(String[] args) {
        IntegerMore100 lab5Object = new IntegerMore100(88);
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
