package ru.ncedu.java.tasks.interfaces.ex10;
import static ru.ncedu.java.tasks.interfaces.ex10.Exercises10.runTogether;
import static ru.ncedu.java.tasks.interfaces.ex10.Exercises10.runInOrder;
public class Main {
    public static void main(String[] args){
        Greeter one = new Greeter("One", 3);
        Greeter two = new Greeter("Two",2);
        runTogether(one,two);
        runInOrder(one,two);

    }
}
