package ru.ncedu.java.tasks.inheritance.ex4;
import java.util.Objects;

/**
 * (ru)Определите абстрактный класс Shape с переменной экземпляра класса Point,
 * конструктором, конкретным методом public void moveBy (double dx, double dy), который
 * перемещает точку на заданную величину, и абстрактным методом public Point getCenter().
 * Привести конкретные подклассы круг, прямоугольник, линия с конструкторами
 * общественные окружность(центр, радиус двойной), общественных прямоугольника(точку левой, двойной ширины,
 * двойной высоты), и по общественной линии(точка с, точка к).
 * (eng)Define an abstract class Shape with an instance variable of class Point, a
 * constructor, a concrete method public void moveBy(double dx, double dy) that
 * moves the point by the given amount, and an abstract method public Point
 * getCenter(). Provide concrete subclasses Circle, Rectangle, Line with constructors
 * public Circle(Point center, double radius), public Rectangle(Point topLeft, double width,
 * double height), and public Line(Point from, Point to).
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

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "("  + x + "," + y +")";
    }

    @Override
    public boolean equals(Object o) {
              if (this == o) return true;
              if (o == null) return false;
              if (getClass() != o.getClass()) return false;
              Point otherPoint = (Point) o;
              if (Double.doubleToLongBits(x) !=Double.doubleToLongBits(otherPoint.x)) return false;
              if (Double.doubleToLongBits(y) !=Double.doubleToLongBits(otherPoint.y)) return false;
              return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}