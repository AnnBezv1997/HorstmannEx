package ru.ncedu.java.tasks.inheritance.ex4;

public class Line extends Shape {
    private Point to;
    private Point from;

    public Line(Point from, Point to){
        super(null);
        this.to = to;
        this.from = from;
    }
    @Override
    public Point getCenter() {
        double x = ( this.from.getX() +this.to.getX()) / 2;
        double y = ( this.from.getY() + this.to.getY()) / 2;
        this.point = new Point(x, y);
        return this.point;
    }
}
