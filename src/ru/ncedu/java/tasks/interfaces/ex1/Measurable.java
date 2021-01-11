package ru.ncedu.java.tasks.interfaces.ex1;
/**
 * (ru)Provide an interface Measurable with a method double getMeasure() that measures an object in some way.
 * Make Employee implement Measurable. Provide a method double average(Measurable[] objects) that computes the average
 * measure. Use it to compute the average salary of an array of employees.
 * (eng)Предоставьте интерфейс, Measurable с помощью метода double getMeasure (), который каким-то образом измеряет
 * объект. Заставить Employee выполнять измеримыми. Предоставьте метод double average (Measurable[] objects),
 * который вычисляет среднюю меру. Используйте его для вычисления средней зарплаты множества Employees.
 */
public interface Measurable {
    double getMeasure ();
}
