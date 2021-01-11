package ru.ncedu.java.tasks.fundamental.ex14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * (ru)Программа, которая считывает двумерный массив целых чисел и определяет, является ли он магическим квадратом
 * (то есть является ли сумма всех строк, всех столбцов и диагоналей одинаковой). Принимайте строки ввода,
 * которые вы разбиваете на отдельные целые числа, и останавливайтесь, когда пользователь вводит
 * пустую строку. Например, с помощью входных данных
 * (eng) Write a program that reads a two-dimensional array of integers and determines whether it is a magic square
 * (that is, whether the sum of all rows, all columns, and the diagonals is the same). Accept lines of input
 * that you break up into individual integers, and stop when the user enters
 * a blank line. For example, with the input
 * 16 3 2 13
 * 5 10 11 8
 * 9 6 7 12
 * 4 15 14 1
 * (Blank line)
 * your program should respond affirmatively.
 */
public class Exercises14 {
    public static void main(String[] args) {
        List<Integer> square = new ArrayList<>();
        Scanner line = new Scanner(System.in);
        boolean result = true;

        while (line.hasNextLine()) {
            String string = line.nextLine();
            Scanner number = new Scanner(string);
            if (!number.hasNextInt()) break;

            while (number.hasNextInt()) {
                square.add(number.nextInt());
            }
        }

        int n = (int) Math.sqrt(square.size());

        int sumRows = 0;
        for (int i = 0; i < n; i++) {
            sumRows += square.get(i);
        }

        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += square.get((i*n)+j);
            }
            if (sum != sumRows) {
                result = false;
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j += 1) {
                sum += square.get(i+(j*n));
            }
            if (sum != sumRows){
                result = false;
            }
        }


        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += square.get(i+(i*n));
        }
        if (sum != sumRows) {
           result = false;
        }

        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += square.get((n*i)+(n-i-1));
        }
        if (sum != sumRows) {
           result = false;
        }


        if(result){
            System.out.println("Is magic square");
        }else {
            System.out.println("not magic");
        }
    }
}
