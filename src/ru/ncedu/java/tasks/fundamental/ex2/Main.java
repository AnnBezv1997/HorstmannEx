package ru.ncedu.java.tasks.fundamental.ex2;

public class Main {
    public static void main(String[] args){
     Exercises2 exercises2 = new Exercises2();
     int angle = exercises2.scanAngle();

        System.out.println(exercises2.normalizeAngle(angle));
        System.out.println(exercises2.normalizeAngleFloorMod(angle));
    }

}
