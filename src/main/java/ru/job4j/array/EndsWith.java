package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        int offset = word.length - postfix.length;
        for (int i = 0; i < postfix.length; i++) {
            if (postfix[i] != word[offset + i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
