package ru.ncedu.java.tasks.fundamental.ex10;
import java.util.Random;
/**
 * (ru)Программа, которая производит случайную строку букв и цифр,
 *     генерируя случайное длинное значение и печатая его в базе 36.
 * (eng)Write a program that produces a random string of letters and digits by
 *      generating a random long value and printing it in base 36.
 */
public class Exercises10 {
    private String string;

    public String generatedString(){
        long randomLong = new Random().nextLong();
        string = Long.toString(randomLong, 36);
        return string;
    }
}
