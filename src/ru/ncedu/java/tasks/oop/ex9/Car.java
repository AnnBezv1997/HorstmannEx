package ru.ncedu.java.tasks.oop.ex9;
/**
 * (ru)Реализуйте класс Car, который моделирует автомобиль, движущийся вдоль оси x, потребляя газ при движении.
 * Предоставьте способы проехать заданное количество миль, добавить заданное количество галлонов в бензобак
 * и получить текущее расстояние от источника и уровня топлива. Укажите топливную экономичность
 * (в милях/галлонах) в конструкторе. Должен ли это быть неизменяемый класс?
 *  * Почему или почему нет?
 *
 * Ответ : класс должен быть изменяемым потому что меняется координата и количество топлива
 *
 * * (eng)Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves.
 * Provide methods to drive by a given number of miles, to add a given number of gallons to the gas tank,
 * and to get the current distance from the origin and fuel level. Specify the fuel efficiency
 * (in miles/gallons) in the constructor. Should this be an immutable class?
 * Why or why not?
 */
public class Car {

    private double x; //координата автомобиля на прямой Х (в милях, начальную точку поставили 0.0 в кострукторе)
    private double gallons;
    private double fuelEfficiency;  // топливная экономичность

    public Car(double fuelEfficiency) {
        this.x = 0.0;
        this.fuelEfficiency = fuelEfficiency;
    }
    public Car(double x,double gallons,double fuelEfficiency) {
        this.x = x;
        this.gallons = gallons;
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getX() {
        return x;
    }

    public double getGallons() {
        return gallons;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    /**
     *Добавить заданное количество литров
     * @param gallons
     */
    public void setGallons(double gallons) {
        this.gallons = this.gallons + gallons;
    }

    /**
     * Проехать нужное количество миль (или узнать что нехватит топлива), текущая координата и количество
     * топлива машины меняется только если хватает топлива для введенного расстояния( в милях)
     ** @param xMiles
     */

    public void moves(double xMiles){
        double needGallons = Math.abs(xMiles*this.fuelEfficiency);

        if (needGallons < this.gallons){
            this.x = this.x + xMiles;
            this.gallons = this.gallons - needGallons;
        }else {
            System.out.println("not enough fuel");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "x=" + x +
                ", gallons=" + gallons +
                ", fuelEfficiency=" + fuelEfficiency +
                '}';
    }
}
