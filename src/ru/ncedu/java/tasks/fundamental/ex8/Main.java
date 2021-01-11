package ru.ncedu.java.tasks.fundamental.ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Exercises8 exercises8 = new Exercises8();
        String s = exercises8.scanString();
        exercises8.printSubstrings(s);
    }
}
