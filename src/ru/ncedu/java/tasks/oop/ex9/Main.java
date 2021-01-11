package ru.ncedu.java.tasks.oop.ex9;

public class Main {
    public static void main(String[] args){
       Car car = new Car(2); // Экономичность 2

        car.setGallons(15);
        System.out.println("Current distance " + car.getX());     //Current distance 0.0
        System.out.println("Fuel level " + car.getGallons());     //Fuel level 15.0

        car.moves(5);
        System.out.println("Current distance " + car.getX());     //Current distance 5.0
        System.out.println("Fuel level " + car.getGallons());     //Fuel level 5.0

        car.moves(-1.5);
        System.out.println("Current distance " + car.getX());     //Current distance 3.5
        System.out.println("Fuel level " + car.getGallons());     //Fuel level 2.0
    }
}
