package ru.ncedu.java.tasks.inheritance.ex6;

import java.util.Objects;

/**
 * (ru)Предположим, что в разделе 4.2.2 “метод equals” (стр. 148) метод
 * Item.equals использует тест instanceof. Реализуйте DiscountedItem. equals так,
 * чтобы он сравнивал только суперкласс, если otherObject является товаром, но также включал скидку, если это
 * DiscountedItem. Покажите, что этот метод сохраняет симметрию, но не является транзитивным—то есть найдите
 * комбинацию элементов и дисконтированных элементов так, чтобы x.equals(y) и y.equals(z), но не x.equals(z).
 * (eng)Suppose that in Section 4.2.2, “The equals Method” (page 148), the Item.equals method uses an instanceof
 * test. Implement DiscountedItem.equals so that it compares only the superclass if otherObject is an Item, but
 * also includes the discount if it is a DiscountedItem. Show that this method preserves symmetry but fails to
 * be transitive—that is, find a combination of items and discounted items so that x.equals(y) and y.equals(z),
 * but not x.equals(z).
 */
public class Item {
    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;
        return Objects.equals(description, item.description) && price == item.price;
    }
}
class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof DiscountedItem)) return true;
        DiscountedItem otherObject = (DiscountedItem) o;
        return discount == otherObject.discount;
    }
}