package ru.ncedu.java.tasks.fundamental.ex13;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Exercises13 exercises13 = new Exercises13();

        List<Integer> numbers = exercises13.fillingNumbers();
        System.out.println("Numbers : " + numbers);

        List<Integer> combination = exercises13.lotteryCombination(numbers);
        System.out.println("Lottery combination : " + combination);

        exercises13.sorted(combination);
        System.out.println("Sorted lottery combination : "+ combination);
    }
}
