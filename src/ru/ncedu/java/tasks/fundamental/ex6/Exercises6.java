package ru.ncedu.java.tasks.fundamental.ex6;

import java.math.BigInteger;

/**
 * (ru)Напишите программу, которая вычисляет факториал n! = 1 × 2 × . . . × n, используя
 * BigInteger. Вычислите факториал 1000
 * (eng)Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
 * BigInteger. Compute the factorial of 1000.
 */
public class Exercises6 {
    private BigInteger factorial;

    public BigInteger calculateFactorial(){
        factorial = BigInteger.valueOf(1);
        for (int i =1; i <=1000;i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
