package ru.ncedu.java.tasks.inheritance.ex1;

public class Main {
    public static void main(String[] args){
        Point point = new Point(5,6);
        LabeledPoint labeledPoint = new LabeledPoint("one",1,2);
        System.out.println(point.getX()+","+point.getY());
        System.out.println(labeledPoint.getLabel()+","+labeledPoint.getX()+"," +labeledPoint.getY());
    }
}
