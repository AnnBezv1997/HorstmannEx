package ru.ncedu.java.tasks.interfaces.ex12;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        final String fileExtension = ".java";
        final String pathName = "F:\\java\\IDEA18\\homeworkNC\\src\\ru\\ncedu\\java\\tasks\\interfaces\\ex12";
        System.out.println(Exercises12.getFiles(pathName, fileExtension));
        //[Exercises12.java, Main.java]
    }
}
