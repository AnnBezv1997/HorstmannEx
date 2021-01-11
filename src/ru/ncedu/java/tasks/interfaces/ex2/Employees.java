package ru.ncedu.java.tasks.interfaces.ex2;

public class Employees implements Measurable {
    private double salary;
    private String name;

    Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return this.salary;
    }
    /**
     * Для вычисления средней зарплаты
     * @param objects
     * @return
     */
    public static double average(Measurable[] objects){
        double sum = 0.0;
        for (Measurable m : objects){
            sum +=m.getMeasure();
        }
        double average = sum/objects.length;
        return average;
    }
    public static Measurable largest(Measurable[] objects){
        Measurable maxSalary = objects[0];
        for(Measurable m : objects){
            if (m.getMeasure() > maxSalary.getMeasure()){
                maxSalary = m;
            }
        }
        return maxSalary;
    }
}
