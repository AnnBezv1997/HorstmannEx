package ru.ncedu.java.tasks.interfaces.ex13;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static ru.ncedu.java.tasks.interfaces.ex13.Exercises13.sortDir;

public class Main {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] lst = dir.listFiles();
        sortDir(lst);
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
