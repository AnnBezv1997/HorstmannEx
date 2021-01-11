package ru.ncedu.java.tasks.fundamental.ex2;
import java.util.Scanner;
import static java.lang.Math.floorMod;
/**
 * (ru) Программа, которая считывает целочисленный угол (который может быть положительным
 * или отрицательным) и нормализует его до значения от 0 до 359 градусов. Попробуйте
 * сначала с оператором%, а затем с floormod
 * (eng) Write a program that reads an integer angle (which may be positive or
 * negative) and normalizes it to a value between 0 and 359 degrees. Try
 * it first with the % operator, then with floorMod.
 */
public class Exercises2 {
    private int angle;
    /**
     * ввод угла который будет нормализоваться
     */
    public int scanAngle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Angle = ");
        if(scanner.hasNextInt()) {
            angle = scanner.nextInt();
        }
        return angle;
    }
    /**
     * Нормализует угол до значения от 0 до 359 градусов.
     * @param angle
     * @return
     */
    public String normalizeAngle(int angle) {
        int n = angle % 360;
        if (n < 0) {
            n = n + 360;
        }
        return "normalize = " + n;
    }
    public String normalizeAngleFloorMod(int angle){
        int n = angle % 360;
        return "normaloze floorMod = " + floorMod(n, 360);
    }

}
