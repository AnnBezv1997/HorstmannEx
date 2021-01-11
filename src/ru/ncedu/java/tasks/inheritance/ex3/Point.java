package ru.ncedu.java.tasks.inheritance.ex3;
/**
 * (ru)Сделайте переменные экземпляра x и y класса Point в упражнении 1 защищенными.
 * Покажите, что класс LabeledPoint может получить доступ к этим переменным только в
 * экземплярах LabeledPoint
 * (eng)Make the instance variables x and y of the Point class in Exercise 1 protected.
 * Show that the LabeledPoint class can access these variables only in LabeledPoint
 * instances
 */
public class Point {
    protected double x;
    protected double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

}
