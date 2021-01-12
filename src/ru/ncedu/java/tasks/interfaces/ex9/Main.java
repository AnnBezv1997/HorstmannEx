package ru.ncedu.java.tasks.interfaces.ex9;

public class Main {
    public static void main(String[] args){
        Greeter one = new Greeter("One", 3);
        Greeter two = new Greeter("Two",2);
        new Thread(one).run();
        new Thread(two).run();
        /**
         * Hello, One
         * Hello, One
         * Hello, One
         * Hello, Two
         * Hello, Two
         */
    }
}
