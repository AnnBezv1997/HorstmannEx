package ru.ncedu.java.tasks.fundamental.ex5;
/**
 * (ru)Что происходит, когда вы приводите double к int, который больше, чем
 * максимально возможное значение int?
 * (eng)What happens when you cast a double to an int that is larger than the
 * largest possible int value? Try it out.
 */
public class Exercises5 {
    public static void main(String[] args){

        double m =Integer.MAX_VALUE + 52516353.0;
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(m);                 //2.2E9
        System.out.println((int)m);            //2147483647 т.е вернуло тоже самое когда приводили к int
    }
}
