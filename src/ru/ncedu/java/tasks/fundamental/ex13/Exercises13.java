package ru.ncedu.java.tasks.fundamental.ex13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * (ru) Программа, которая печатает лотерейную комбинацию, выбирая шесть различных
 * чисел от 1 до 49. Чтобы выбрать шесть различных чисел, начните со списка
 * массивов, заполненного 1...49. выберите случайный индекс и удалите элемент.
 * Повторите шесть раз. Распечатайте результат в отсортированном порядке.
 * (eng) Write a program that prints a lottery combination, picking six distinct
 * numbers between 1 and 49. To pick six distinct numbers, start with an
 * array list filled with 1...49. Pick a random index and remove the element.
 * Repeat six times. Print the result in sorted order.
 */
public class Exercises13 {
    private List<Integer> numbers = new ArrayList<>();
    private List<Integer> combination = new ArrayList<>();

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<Integer> getCombination() {
        return combination;
    }

    /**
     * Заполняет массив из которого будут выбраться числа от 0 до 49
     * @return
     */
    public List<Integer> fillingNumbers(){
        for(int i = 0; i <= 49; i++){
            numbers.add(i);
        }
        return numbers;
    }

    /**
     * Выбирает случайные индексы и удаляет
     * @param numbers
     * @return
     */
    public List<Integer> lotteryCombination(List<Integer> numbers){
        Random random = new Random();
        int rand;
        for(int i = 0; i < 6; i++){
            rand = random.nextInt(49-i);
            combination.add(numbers.remove(rand));
        }
         return combination;
    }

    /**
     * Сортировка итогового массива
     * @param combination
     */
    public void sorted(List<Integer> combination){
        Collections.sort(combination);
    }


}
