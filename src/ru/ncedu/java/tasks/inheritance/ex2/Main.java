package ru.ncedu.java.tasks.inheritance.ex2;

import ru.ncedu.java.tasks.inheritance.ex1.LabeledPoint;
import ru.ncedu.java.tasks.inheritance.ex1.Point;

public class Main {
    public static void main(String[] args){
        Point point1 = new Point(5,6);
        Point point2 = new Point(5,6);
        Point point3 = new Point(2,8);
        System.out.println(point2.equals(point1));
        System.out.println(point1.equals(point3));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        LabeledPoint labeledPoint1 = new LabeledPoint("one",1,2);
        LabeledPoint labeledPoint2 = new LabeledPoint("two",1,2);
        LabeledPoint labeledPoint3 = new LabeledPoint("tree",3,7);
        System.out.println(labeledPoint1.equals(labeledPoint2));
        System.out.println(labeledPoint1.equals(labeledPoint3));
        System.out.println(labeledPoint1.hashCode());
        System.out.println(labeledPoint2.hashCode());
    }
}
