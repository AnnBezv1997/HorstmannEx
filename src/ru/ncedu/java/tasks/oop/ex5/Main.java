package ru.ncedu.java.tasks.oop.ex5;

public class Main {
    public static void main(String[] args){
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p.toString());
    }
}
