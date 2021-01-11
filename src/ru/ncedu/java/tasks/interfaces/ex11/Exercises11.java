package ru.ncedu.java.tasks.interfaces.ex11;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * (ru)Используя методы listFiles(FileFilter) и isDirectory класса java.io.File
 * , напишите метод, который возвращает все подкаталоги данного каталога.
 * Используйте лямбда-выражение вместо объекта FileFilter. Повторите с
 * выражением метода и анонимным внутренним классом
 * (eng)Using the listFiles(FileFilter) and isDirectory methods of the java.io.File
 * class, write a method that returns all subdirectories of a given directory.
 * Use a lambda expression instead of a FileFilter object. Repeat with a
 * method expression and an anonymous inner class
 */
public class Exercises11 {
    public File[] getDirectories(File file, FileFilter filter) {
        ArrayList<File> files = new ArrayList<>();
        for (File f: file.listFiles(filter)) {
            if (f.isDirectory()) {
                files.add(f);
                getDirectories(f, filter);
            }
        }

        File[] result = new File[files.size()];
        result = files.toArray(result);
        return result;
    }
}
