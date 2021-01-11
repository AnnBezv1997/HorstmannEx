package ru.ncedu.java.tasks.fundamental.ex3;

import java.util.*;

/**
 * (ru)Используя только условный оператор, напишите программу, которая считывает три целых
 * числа и выводит наибольшее. Повторите с Math.max.
 * (eng)Using only the conditional operator, write a program that reads three
 * integers and prints the largest. Repeat with Math.max.
 */
public class Exercises3 {
    private int[] numbers = new int[3];

    public int[] getNumbers() {
        return numbers;
    }

    /**
     * ввод массива
     * @return int[]
     */
    public int[] scanNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numbers = ");
        if(scanner.hasNextInt()) {
            for (int i=0; i< numbers.length;i++) {
                numbers[i] = scanner.nextInt();
            }
        }
        return numbers;
    }

    /**
     * Поиск максимального в массиве из трех элементов
     * @param numbers
     * @return
     */
    public int maxNumber(int[] numbers){
        int max = numbers[0];
        if (numbers[1] > max) {
                max=numbers[1];
        }else if(numbers[2] > max){
            max=numbers[2];
        }
        return max;
    }
    public int maxNumberMathMax(int[] numbers){
        int i =0;
        int maxTemp = Math.max(numbers[i], numbers[i+1]);
        int max = Math.max(maxTemp,numbers[i+2]);
        return max;
    }

    @Override
    public String toString() {
        return  "Numbers[] = " + Arrays.toString(numbers);
    }
}
