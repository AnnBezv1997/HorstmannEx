package ru.ncedu.java.tasks.interfaces.ex5;



public class Main {
    public static void main(String[] args){
        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (sequence.hasNext()){
            System.out.println(sequence.next());
        }
        IntSequence constant = IntSequence.constant(1);
        for (int i = 0; i < 5 && constant.hasNext(); i++) {
            System.out.println(constant.next());
        }
    }
}
