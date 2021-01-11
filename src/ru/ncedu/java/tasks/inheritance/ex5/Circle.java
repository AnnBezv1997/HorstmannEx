package ru.ncedu.java.tasks.inheritance.ex5;

public class Circle extends Shape {
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }
    @Override
    public Point getCenter() {
        return this.point;
    }
    @Override
    public Circle clone(){
        Circle newCircle = new Circle(this.point,this.radius);
        return newCircle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +"center ="+this.point.toString()+"}";
    }
}
