package com.knubisoft.chapter_4_stack_queue.stack.reverse;

import com.knubisoft.chapter_4_stack_queue.stack.CustomStack;

public class Reverser {

    private String input;
    private String output;

    public Reverser(String input) {
        this.input = input;
    }

    public String reverse() {
        output = "";
        int stackSize = input.length();
        CustomStack stack = new CustomStack(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            char c = (char) stack.pop();
            output = output + c;
        }
        return output;
    }

}
