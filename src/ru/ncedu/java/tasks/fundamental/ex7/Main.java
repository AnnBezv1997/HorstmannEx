package ru.ncedu.java.tasks.fundamental.ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Exercises7 exercises7 = new Exercises7();
        int n1 = exercises7.getNumberOne();
        int n2 = exercises7.getNumberTwo();
        System.out.println("Sum = " + exercises7.unsignedSum(n1,n2));
        System.out.println("Difference = "+ exercises7.unsignedDifference(n1,n2));
        System.out.println("Product = " + exercises7.unsignedProduct(n1,n2));
        System.out.println("Quotient = " + exercises7.unsignedQuotient(n1,n2));
        System.out.println("Remainder = " + exercises7.unsignedRemainder(n1,n2));

    }
}
