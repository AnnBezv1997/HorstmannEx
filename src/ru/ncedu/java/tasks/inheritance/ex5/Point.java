package ru.ncedu.java.tasks.inheritance.ex5;

/**
 * (ru)Определите методы клонирования для классов предыдущего упражнения.
 * (eng)Define clone methods for the classes of the preceding exercise.
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