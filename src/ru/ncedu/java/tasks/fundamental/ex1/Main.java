package ru.ncedu.java.tasks.fundamental.ex1;

public class Main {
    public static void main(String[] args) {
        Exercises1 exercises1  = new Exercises1();
        int n = exercises1.scanNumber();

        System.out.println(exercises1.toBinary(n));
        System.out.println(exercises1.toOctal(n));
        System.out.println(exercises1.toHexadecimal(n));
        System.out.println(exercises1.reciprocal(n));

    }

}
