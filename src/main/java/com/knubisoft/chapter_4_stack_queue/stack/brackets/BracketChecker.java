package com.knubisoft.chapter_4_stack_queue.stack.brackets;

import com.knubisoft.chapter_4_stack_queue.stack.CustomStack;

public class BracketChecker {

    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check() {
        int stackSize = input.length();
        CustomStack stack = new CustomStack(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;

                case '}':
                case ']':
                case ')':
            }
        }
    }
}
