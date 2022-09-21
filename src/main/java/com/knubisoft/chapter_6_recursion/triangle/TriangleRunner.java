package com.knubisoft.chapter_6_recursion.triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleRunner {
    static int number;

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        number = getInt();
        System.out.println("Triangle=" + triangle(number));
    }

    public static int triangle(int n) {
        if (n == 1)
            return 1;
        else return n + triangle(n - 1);
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        return bufferedReader.readLine();
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

}