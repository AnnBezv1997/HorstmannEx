package ru.ncedu.java.tasks.interfaces.ex12;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * (ru)Использование метода list (FilenameFilter) java.io.Класс File, напишите метод
 * , который возвращает все файлы в заданном каталоге с заданным расширением. Используйте
 * лямбда-выражение, а не FilenameFilter. Какую переменную из охватывающей
 * области она захватывает?
 * (eng)Using the list(FilenameFilter) method of the java.io.File class, write a method
 * that returns all files in a given directory with a given extension. Use a
 * lambda expression, not a FilenameFilter. Which variable from the enclosing
 * scope does it capture?
 */
public class Exercises12 {
    public static List<String> getFiles(String pathname, String extention) {
        File path = new File(pathname);

        String[] strings = path.list((extention1, name) -> name.toLowerCase().endsWith(extention));

        List<String> result = Arrays.asList(strings);
        return result;
    }
    public static void main(String args[]) {
        final String fileExtension = ".java";
        final String pathName = "F:\\java\\IDEA18\\homeworkNC\\src\\ru\\ncedu\\java\\tasks\\interfaces\\ex12";
        System.out.println(getFiles(pathName, fileExtension));//[Exercises12.java, Main.java]
    }
}
