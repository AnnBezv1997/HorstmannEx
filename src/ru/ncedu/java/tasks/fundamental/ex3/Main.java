package ru.ncedu.java.tasks.fundamental.ex3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Exercises3 exercises3 = new Exercises3();
       exercises3.scanNumbers();
        System.out.println(exercises3.toString());
        System.out.println("Max = " + exercises3.maxNumber(exercises3.getNumbers()));
        System.out.println("Max Math.max = " + exercises3.maxNumberMathMax(exercises3.getNumbers()));
    }

}
