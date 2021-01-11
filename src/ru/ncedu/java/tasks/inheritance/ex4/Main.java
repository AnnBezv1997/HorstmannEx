package ru.ncedu.java.tasks.inheritance.ex4;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(new Point(3, 1), 2);
        Shape rectangle = new Rectangle(new Point(2, 2), 4, 2);
        Shape line = new Line(new Point(1, 1), new Point(3, 3));
        System.out.println(circle.getCenter());
        System.out.println(rectangle.getCenter());
        System.out.println(line.getCenter());

    }
}
