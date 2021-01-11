package ru.ncedu.java.tasks.fundamental.ex7;

import java.util.Scanner;

/**
 * (ru)Программу, которая считывает два целых числа от 0 до 4294967295, сохраняет их в переменных int,
 * вычисляет и отображает их беззнаковую сумму, разность, произведение, частное и остаток.
 * Не преобразуйте их в длинные значения.
 * (eng)Write a program that reads in two integers between 0 and 4294967295,stores them in int variables,
 * and computes and displays their unsigned sum, difference, product, quotient, and remainder.
 * Do not convert them to long values
 */
public class Exercises7 {
    private int numberOne;
    private int numberTwo;
    /*
     * ввод двух чисел в этой задаче сделала как контруктор по умолчанию
     */
    public Exercises7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number one = ");
        numberOne = scanner.nextInt();
        System.out.println("Number two = ");
        numberTwo = scanner.nextInt();
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }
    /*
     * Вычисляет и отображает их беззнаковую сумму, разность, произведение, частное и остаток
     * @param int numberOne, int numberTwo
     * @return String
     */
    public String unsignedSum(int numberOne, int numberTwo){
        int sum = numberOne+numberTwo;
        return Integer.toUnsignedString(sum);
    }
    public String unsignedDifference(int numberOne, int numberTwo){
        int difference = numberOne - numberTwo;
        return Integer.toUnsignedString(difference);
    }
    public String unsignedProduct(int numberOne, int numberTwo){
        int product = numberOne * numberTwo;
        return Integer.toUnsignedString(product);
    }
    public String unsignedQuotient(int numberOne, int numberTwo){
        int quotient = Integer.divideUnsigned(numberOne,numberTwo);
        return Integer.toUnsignedString(quotient);
    }
    public String unsignedRemainder(int numberOne, int numberTwo){
        int remainder = Integer.remainderUnsigned(numberOne,numberTwo);
        return Integer.toUnsignedString(remainder);
    }

}
