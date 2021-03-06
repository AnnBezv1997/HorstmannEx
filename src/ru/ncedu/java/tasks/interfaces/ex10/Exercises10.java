package ru.ncedu.java.tasks.interfaces.ex10;
/**
 * (ru)Реализовать методы :
 * public static void runTogether(Runnable... tasks)
 * public static void runInOrder(Runnable... tasks)
 * Первый метод должен запускать каждую задачу в отдельном потоке, а затем возвращаться. Второй метод должен запускать
 * все методы в текущем потоке и возвращаться после завершения последнего.
 * (eng)Implement methods :
 * public static void runTogether(Runnable... tasks)
 * public static void runInOrder(Runnable... tasks)
 * The first method should run each task in a separate thread and then return. The second method should run
 * all methods in the current thread and return when the last one has completed.
 */
public class Exercises10 {

    public static void runTogether(Runnable... tasks){
           for(Runnable task : tasks){
               Thread thread = new Thread(task);
               thread.start();
           }
    }
    public static void runInOrder(Runnable... tasks){
          for (Runnable task : tasks){
              task.run();
          }
    }
}
