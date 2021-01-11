package ru.ncedu.java.tasks.inheritance.ex7;
/**
 * (ru)Определите тип перечисления для восьми комбинаций основных цветов
 * Черный, красный, синий, зеленый, голубой, пурпурный, желтый, белый с методами getRed, getGreen
 * и getBlue
 * (eng)Define an enumeration type for the eight combinations of primary colors
 * BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE with methods getRed, getGreen,
 * and getBlue.
 */
public enum Colors {
    BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE;
    public static Colors getRed() {
        return RED;
    }
    public static Colors getBlue() {
        return BLUE;
    }
    public static Colors getGreen() {
        return GREEN;
    }
}
