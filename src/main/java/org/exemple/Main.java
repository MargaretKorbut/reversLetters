package org.exemple;

import static org.exemple.util.StingUtil.reverseLetters;

public class Main {
    public static void main(String[] args) {
        String s = "J@va the be$t!123";
        String result = reverseLetters(s);
        System.out.println(result);
    }
}