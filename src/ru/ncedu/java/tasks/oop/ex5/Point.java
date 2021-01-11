package ru.ncedu.java.tasks.oop.ex5;
/**
 * (ru)Реализуйте неизменяемый класс Point, описывающий точку на плоскости.
 * Предоставьте конструктор, чтобы установить его в определенную точку, конструктор no-arg, чтобы
 * установить его в начало координат, и методы getX, getY, translate и scale. Метод translate
 * перемещает точку на заданную величину в направлении x и Y. Метод масштабирования
 * масштабирует обе координаты на заданный коэффициент. Реализуйте эти
 * методы так, чтобы они возвращали новые точки с результатами. Например,
 * точка p = новая точка(3, 4). перевести (1, 3). Масштаб (0,5);
 * следует установить p в точку с координатами (2, 3.5)
 * (eng)Implement an immutable class Point that describes a point in the plane.
 * Provide a constructor to set it to a specific point, a no-arg constructor to
 * set it to the origin, and methods getX, getY, translate, and scale. The translate
 * method moves the point by a given amount in x- and y-direction. The
 * scale method scales both coordinates by a given factor. Implement these
 * methods so that they return new points with the results. For example,
 * Point p = new Point(3, 4).translate(1, 3).scale(0.5);
 * should set p to a point with coordinates (2, 3.5)
 */
public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /**
     * Метод масштабирования масштабирует обе координаты на заданный коэффициент.
     * @param scale
     * @return
     */
    public Point scale(double scale){
        return new Point(this.x*scale, this.y*scale);
    }

    /**
     * Метод translate перемещает точку на заданную величину в направлении x и Y.
     * @param x
     * @param y
     * @return
     */
    public Point translate(double x, double y){
        return new Point(this.x + x, this.y + y);
    }

    @Override
    public String toString() {
        return   "(" + x + ", " + y + ")";
    }
}
