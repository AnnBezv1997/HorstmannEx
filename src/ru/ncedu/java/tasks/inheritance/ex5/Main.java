package ru.ncedu.java.tasks.inheritance.ex5;
/**
 * (ru)Определите методы клонирования для классов предыдущего упражнения.
 * (eng)Define clone methods for the classes of the preceding exercise.
 */
public class Main {
    public static void main(String[] args){
        Point centr = new Point(1,1);
        Circle myCircle1 = new Circle(centr,2);
        Circle myCircle2 = myCircle1.clone();
        System.out.println(myCircle1.toString()+","+myCircle2.toString());
    }
}
