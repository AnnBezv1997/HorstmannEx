package ru.ncedu.java.tasks.inheritance.ex4;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point topleft, double width, double height) {
        super(topleft);
        this.width = width;
        this.height = height;
    }
    @Override
    public Point getCenter() {
        double x = this.point.getX() + (this.width) / 2;
        double y =  this.point.getY() -( this.height) / 2;
        return new Point(x, y);
    }

}
