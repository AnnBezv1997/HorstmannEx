package ru.ncedu.java.tasks.interfaces.ex8;

import java.util.ArrayList;
import static ru.ncedu.java.tasks.interfaces.ex8.Exercises8.luckySort;
import static ru.ncedu.java.tasks.interfaces.ex8.Exercises8.stringComparator;
public class Main {
    public static void main(String[] args){

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("string");
        arrayList.add("list");
        arrayList.add("compare");
        luckySort(arrayList,stringComparator());
        System.out.println(arrayList.toString()); //[compare, list, string]
    }
}
