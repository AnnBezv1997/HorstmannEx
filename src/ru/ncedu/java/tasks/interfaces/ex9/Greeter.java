package ru.ncedu.java.tasks.interfaces.ex9;
/**
 * (ru)Реализуйте класс Greeter, который реализует Runnable и чей метод run
 * печатает n копий "Hello" + target, где n и target заданы в конструкторе. Создайте два экземпляра с разными сообщениями и выполните
 * их одновременно в двух потоках
 * (eng)Implement a class Greeter that implements Runnable and whose run method
 * prints n copies of "Hello, " + target, where n and target are set in the constructor. Construct two instances with different messages and execute
 * them concurrently in two threads
 */
public class Greeter implements Runnable{
    private String target;
    private int n;

    public Greeter(String target, int n) {
        this.target = target;
        this.n = n;
    }

    @Override
    public void run() {

        for(int i =0; i < n;i++){
            System.out.println("Hello, "+ target);
        }
    }
}
