package ru.ncedu.java.tasks.interfaces.ex4;
/**
 * (ru)Реализуйте статический метод IntSequence, который дает последовательность
 * с аргументами. Например, IntSequence. of(3, 1, 4, 1, 5, 9) дает
 * последовательность с шестью значениями. Дополнительный кредит, если вы возвращаете экземпляр
 * анонимного внутреннего класса.
 * (eng)Implement a static of method of the IntSequence class that yields a sequence
 * with the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a
 * sequence with six values. Extra credit if you return an instance of an
 * anonymous inner class.
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
    public boolean hasNext();
    public int next();
}
