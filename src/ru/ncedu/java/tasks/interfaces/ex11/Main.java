package ru.ncedu.java.tasks.interfaces.ex11;

import java.io.File;
import java.io.FileFilter;

public class Main {
    public static void main(String[] args) {
        Exercises11 exception11 = new Exercises11();
        File file = new File(".");

        exception11.getDirectories(file, (path) -> path.isDirectory());
        exception11.getDirectories(file, File::isDirectory);
        exception11.getDirectories(file, new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
    }

}
