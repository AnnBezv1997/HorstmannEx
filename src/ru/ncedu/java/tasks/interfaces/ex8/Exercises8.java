package ru.ncedu.java.tasks.interfaces.ex8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * (ru)Реализуем метод void luckySort(ArrayList<String> strings, Comparator<String>
 * comp), который продолжает вызывать Collections. shuffle в списке массивов до тех пор, пока элементы не
 * окажутся в порядке возрастания, определяемом компаратором.
 * (eng)Implement the method void luckySort(ArrayList<String> strings, Comparator<String>
 * comp) that keeps calling Collections.shuffle on the array list until the elements
 * are in increasing order, as determined by the comparator.
 */
public class Exercises8 {
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp){
        ArrayList<String> arraySort = new ArrayList<>(strings);
        Collections.sort(arraySort, comp);
        while (!strings.equals(arraySort)) {
            Collections.shuffle(strings);
        }
    }
    public static Comparator<String> stringComparator(){
       return new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        };
    }

}
