package ru.ncedu.java.tasks.fundamental.ex1;
import java.util.Scanner;
/**
 * (ru) Программа, которая считывает целое число и выводит его в двоичном, восьмеричном и
 *  шестнадцатеричном виде. Выведите обратную величину в виде шестнадцатеричного числа
 *  с плавающей запятой.
 * (eng) Write a program that reads an integer and prints it in binary, octal, and
 * hexadecimal. Print the reciprocal as a hexadecimal floating-point number.
 */
public class Exercises1 {
    private int number;
    /**
     * для ввода числа которое будет переводится
     */
    public int scanNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number = ");
        if(scanner.hasNextInt()) {
            number = scanner.nextInt();
        }
            return number;
    }

    /**
     * Представления в бинарном ,восьмеричном и шестнадцатеричном виде.
     * @param number
     * @return
     */
    public String toBinary(int number){
            return "Binary = " + Integer.toBinaryString(number);
    }
    public String toOctal(int number){
            return "Octal = " + Integer.toOctalString(number);
    }
    public String toHexadecimal(int number){
            return "Hexadecimal = " + Integer.toHexString(number);
    }
    public String reciprocal(int number){
        if(number != 0) {
            float reverse = (float) 1 / number;
            return "Hexadecimal floating-point = " + Float.toHexString(reverse);
        }else {
            return "Error reciprocal.";
        }
    }
}
