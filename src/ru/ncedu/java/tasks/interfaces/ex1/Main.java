package ru.ncedu.java.tasks.interfaces.ex1;

import static ru.ncedu.java.tasks.interfaces.ex1.Employees.average;

public class Main {
    public static void main(String[] args){
        Employees employee1 = new Employees("Ronald Weasley",2000);
        Employees employee2 = new Employees("Garry Potter",3500);
        Employees employee3 = new Employees("Hermione Granger",2900);
        Employees[] gryffindor = {employee1,employee2,employee3};
        System.out.println(average(gryffindor)); //  2800.0
    }
}
