package ru.ncedu.java.tasks.fundamental.ex8;

import java.util.Scanner;

/**
 * (ru)Программа, которая считывает строку и печатает все ее непустые подстроки.
 * (eng)Write a program that reads a string and prints all of its nonempty
 * substrings.
 */
public class Exercises8 {
    private String string;
    /**
     * Вводим строку
     * @return
     */
    public String scanString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("String : ");
        string = scanner.nextLine();
        return string;
    }
    /**
     * Выводит подстроки
     * @param string
     */
    public void printSubstrings(String string){
        int i=0;
        while(!string.substring(i).isEmpty()){
            System.out.println(string.substring(i,i+1));
            i++;
        }
    }

}
