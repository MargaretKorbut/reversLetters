package org.exemple.util;

import org.exemple.util.StingUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

//Небуквенные символы по краям и в середине — проверьте, что они остались на своих позициях.
//Регистр — буквы меняются местами вместе со своим регистром (заглавная едет туда, куда едет буква).

class StingUtilTest {

        //Обычный случай — пример из условия: "J@va the be$t!123" → "t@eb eht av$J!123".
        @Test
        void testReversOnlyLetters() {
            String input = "J@va the be$t!123";
            String expected = "t@eb eht av$J!123";

            String actual = StingUtil.reverseLetters(input);
            assertEquals(expected, actual);
        }

        //Пустая строка "" — результат тоже пустая строка.
        @Test
        void testReturnsEmptyForEmptyInput() {
            String input = "";
            String expected = "";

            String actual = StingUtil.reverseLetters(input);
            assertEquals(expected, actual);
        }

        //Пустая строка null — результат пустая строка.
        @Test
        void testReturnsEmptyForNullInput() {
            String input = null;
            String expected = "";

            String actual = StingUtil.reverseLetters(input);
            assertEquals(expected, actual);
        }

        //Одна буква "a" — остаётся как есть.
        @Test
        void testOnlyOneLetterAInPlace() {
            String input = "1234a";
            String expected = "1234a" ;

            String actual = StingUtil.reverseLetters(input);
            assertEquals(expected, actual);
        }

        //Строка без букв "123 !@#" — ничего не меняется.
        @Test
        void testKeepsNonLettersInPlace() {
            String input = "123 !@#";
            String expected = "123 !@#";

            String actual = StingUtil.reverseLetters(input);
            assertEquals(expected, actual);
        }

        //Только буквы "abcd" → "dcba" (обычный разворот).
        @Test
        void testKeepsOnlyLettersInPlace() {
            String input = "abcd";
            String expected = "dcba";

            String actual = StingUtil.reverseLetters(input);
            assertEquals(expected, actual);
        }
}

