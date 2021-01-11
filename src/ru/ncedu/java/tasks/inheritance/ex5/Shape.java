package ru.ncedu.java.tasks.inheritance.ex5;
/**
 * (ru)Определите методы клонирования для классов предыдущего упражнения.
 * (eng)Define clone methods for the classes of the preceding exercise.
 */
public abstract class Shape implements Cloneable {
    protected Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
    }

    abstract public Point getCenter();

    @Override
    public abstract Shape clone() ;


}