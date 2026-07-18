package org.exemple.util;

public class StringUtil {
    public static void StringUtil(){
        String s = "J@va the be$t!123"; // надо перевернуть местами буквы, но не символы.
        int n = s.length();  //17
        char c = s.charAt(0);  //J
        char[] chars = s.toCharArray();  //массив символов типа такого - ['J', 'a', 'v', 'a']
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {  //если левый символ НЕ буква, идем дальше
                left++;
            } else if (!Character.isLetter(chars[right])) {  //если правый символ НЕ буква то идем дальше
                right--;
            } else {
                char tmp = chars[left];
                chars[left] = chars[right];  //переворачивает слово ЕСЛИ И ЛЕВО И ПРАВО ЯВЛЯЕТСЯ БУКВОЙ!!!
                chars[right] = tmp;
                left++;
                right--;
            }
        }  // после всего вайл с массивом, переделываем массив с СТРОКУ, как в начале задания. пишем его.
        System.out.println(new String(chars));  //массив символов стал строкой
    }
}
