package ru.ncedu.java.tasks.fundamental.ex9;
/**
 * (ru)В разделе 1.5.3 “сравнение строк " (стр. 25) приведен пример двух строк
 *     s и t так, что s.равно(t), но s != t. придумайте другой пример,
 *     который не использует подстроку).
 * (eng)Section 1.5.3, “String Comparison” (page 25) has an example of two strings
 *      s and t so that s.equals(t) but s != t. Come up with a different example
 *      that doesn’t use substring).
 */

public class Exercises9 {
  public static void main(String[] args){
        String string1 = "Exercises";
        String string2 = String.copyValueOf(string1.toCharArray());
        System.out.println(string1.equals(string2)); //true
        System.out.println(string1 == string2); //false
        //или
        String string3 = "Exercises1";
        char[] str4=new char[string3.length()] ;
        string3.getChars(0,string3.length(),str4,0);
        String string4 = new String(str4);
        System.out.println(string3.equals(string4)); //true
        System.out.println(string3 == string4); //false
    }
}
