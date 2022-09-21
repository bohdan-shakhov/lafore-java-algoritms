package com.knubisoft.chapter_6_recursion.anagram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnagramRunner {

    static int size;
    static int count;
    static char[] chars = new char[100];

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a word: ");
        String input = getString();
        size = input.length();
        count = 0;

        for (int i = 0; i < size; i++) {
            chars[i] = input.charAt(i);
        }

        doAnagram(size);
    }

    public static void doAnagram(int newSize) {
        if (newSize == 1)
            return;

        for (int i = 0; i < newSize; i++) {
            doAnagram(newSize - 1);

            if (newSize == 2)
                displayWord();

            rotate(newSize);
        }
    }

    public static void rotate(int newSize) {
        int j;
        int position = size - newSize;
        char temp = chars[position];

        for (j = position + 1; j < size; j++)
            chars[j - 1] = chars[j];

        chars[j - 1] = temp;
    }

    public static void displayWord() {
        if (count < 99)
            System.out.print(" ");

        if (count < 9)
            System.out.print(" ");

        System.out.print(++count + " ");

        for (int i = 0; i < size; i++) {
            System.out.print(chars[i]);
        }

        System.out.print("   ");
        System.out.flush();

        if (count % 6 == 0)
            System.out.println("");
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
