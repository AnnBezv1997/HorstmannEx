package ru.ncedu.java.tasks.inheritance.ex2;
import java.util.Objects;
/**
 * (ru)Определите класс Point с помощью конструктора public Point (double x, double y) и
 * методов доступа getX, getY. Определите подкласс LabeledPoint с помощью конструктора
 * public LabeledPoint(String label, double x, double y) и метода
 * доступа getLabel.
 * 2. Определите методы toString, equals и hashCode для классов предыдущего
 * упражнения.
 * (eng)Define a class Point with a constructor public Point(double x, double y) and
 * accessor methods getX, getY. Define a subclass LabeledPoint with a constructor
 * public LabeledPoint(String label, double x, double y) and an accessor method
 * getLabel.
 * 2. Define toString, equals, and hashCode methods for the classes of the preceding
 * exercise.
 */
public class Point {
    private double x;
    private double y;

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