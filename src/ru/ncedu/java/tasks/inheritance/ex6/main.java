package ru.ncedu.java.tasks.inheritance.ex6;

public class main {
    public static void main(String[] args) {
        Item i1 = new DiscountedItem("item", 20, 1);
        Item i2 = new Item("item", 20);
        Item i3 = new DiscountedItem("item", 20, 2);

        // x.equals(y) and y.equals(z), but not x.equals(z).
        System.out.println(" i1.equals(i2) " + i1.equals(i2));
        System.out.println(" i2.equals(i3) " + i2.equals(i3));
        System.out.println(" i1.equals(i3) " + i1.equals(i3));
    }
}
