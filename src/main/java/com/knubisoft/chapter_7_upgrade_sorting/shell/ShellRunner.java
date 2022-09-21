package com.knubisoft.chapter_7_upgrade_sorting.shell;

public class ShellRunner {
    public static void main(String[] args) {
        ArrayShell arrayShell = new ArrayShell(1000);
        for (int i = 0; i < 1000; i++) {
            long n = (int) (Math.random() * 10000);
            arrayShell.insert(n);
        }

        arrayShell.display();
        arrayShell.shellSort();
        arrayShell.display();
    }
}
