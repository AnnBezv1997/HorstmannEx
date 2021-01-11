package ru.ncedu.java.tasks.interfaces.ex2;
/**
 * (ru)Продолжите предыдущее упражнение и предложите метод Measurable largest(Measurable[] objects).
 * Используйте его, чтобы найти имя employee с самой большой зарплатой. Зачем тебе cast?
 * Ответ: Делаем приведение типов в Main - (Employees)largest, потому что Measurable не имеет метода
 * для вывода имени, а метод largest возвращает обьект Measurable.
 * (eng)Continue with the preceding exercise and provide a method Measurable
 * largest(Measurable[] objects). Use it to find the name of the employee with
 * the largest salary. Why do you need a cast?
 */
public interface Measurable {
    double getMeasure ();

}
