package ru.ncedu.java.tasks.interfaces.ex5;
/**
 * (ru)Добавьте статический метод с именем constant класса IntSequence, который
 * дает бесконечную постоянную последовательность. Например, IntSequence.constant(1)
 * дает значения 1 1 1..., до бесконечности. Дополнительный кредит, если вы сделаете это с помощью
 * лямбда-выражения.
 * (eng)Add a static method with the name constant of the IntSequence class that
 * yields an infinite constant sequence. For example, IntSequence.constant(1)
 * yields values 1 1 1..., ad infinitum. Extra credit if you do this with a
 * lambda expression.
 */

public interface IntSequence {
    public static IntSequence of(int... arguments){
        return new IntSequence(){
            private int index = 0;
            @Override
            public boolean hasNext(){
                return index < arguments.length;
            }
            @Override
            public int next(){
                return arguments[index++];
            }
        };
    }
    public static IntSequence constant(int arguments){
        return () -> arguments;
    }
     default boolean hasNext(){
        return true;
    };
    public int next();
}
