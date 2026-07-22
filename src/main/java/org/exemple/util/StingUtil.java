package org.exemple.util;

public class StingUtil {
    public static String reverseLetters(String s){

        int n = s.length();
        char c = s.charAt(0);
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {  //если левый символ НЕ буква, идем дальше
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char tmp = chars[left];
                chars[left] = chars[right];  //переворачивает слово ЕСЛИ И ЛЕВО И ПРАВО ЯВЛЯЕТСЯ БУКВОЙ!!!
                chars[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(chars);  //массив символов стал строкой
    }
}
