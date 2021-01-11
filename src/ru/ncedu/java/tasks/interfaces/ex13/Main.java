package ru.ncedu.java.tasks.interfaces.ex13;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] lst = dir.listFiles();
        Exercises13.sortDir(lst);
        for (File f : lst) {
            System.out.println(f.getName());
        }
    }
    /** Вывод:
      * .idea
      * out
      * src
      * homeworkNC.iml
     */
}
