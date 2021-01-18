package ru.ncedu.java.tasks.interfaces.ex11;

import java.io.File;
import java.util.List;
import static ru.ncedu.java.tasks.interfaces.ex11.Exercises11.getSubdirectoriesThree;
import static ru.ncedu.java.tasks.interfaces.ex11.Exercises11.getSubdirectoriesTwo;


public class Main {
    public static void main(String[] args) {
        List<File> files = getSubdirectoriesThree(".");
        System.out.println(files);    //[.\.idea, .\out, .\src]
        List<File> files1 = getSubdirectoriesTwo(".");
        System.out.println(files1);    //[.\.idea, .\out, .\src]

    }
}

