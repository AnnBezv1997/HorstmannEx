package ru.ncedu.java.tasks.interfaces.ex13;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
/**
 * (ru)Учитывая массив файловых объектов, отсортируйте его так, чтобы каталоги стояли перед файлами,
 * а внутри каждой группы элементы сортировались по пути. Используйте лямбда
 * -выражение для указания компаратора.
 * (eng) Given an array of File objects, sort it so that directories come before files,
 * and within each group, elements are sorted by path name. Use a lambda
 * expression to specify the Comparator.
 */
public class Exercises13 {
    static void sortDir(File[] files) {
        Arrays.sort(files, (f1, f2) -> {
            if (f1.isDirectory() && !f2.isDirectory()) {
                return -1;
            } else if (!f1.isDirectory() && f2.isDirectory()) {
                return 1;
            } else {
                return f1.compareTo(f2);
            }
        });
    }
}
