package ru.ncedu.java.tasks.fundamental.ex4;
/**
 * (ru)Программа, которая печатает наименьшие и наибольшие положительные двойные значения.
 * Подсказка: искать Math.nextUp в Java API.
 * (eng) Write a program that prints the smallest and largest positive double values.
 * Hint: Look up Math.nextUp in the Java API.
 */
public class Exercises4 {
    private double maxValue;
    private double minValue ;

    public double getMaxValue() {
        maxValue = Double.MAX_VALUE;
        return maxValue;
    }

    public double getMinValue() {
        minValue = Math.nextUp(0.0);
        return minValue;
    }
}
