package com.knubisoft.chapter_2_arrays.array.oop;

public class ArrayRunner {
    public static void main(String[] args) {
        Array array = new Array(10);
        array.display();
        array.insert(21);
        array.insert(33);
        array.insert(45);
        array.insert(91);
        array.insert(23);
        array.insert(99);
        array.display();
        System.out.println(array.find(21));
        array.delete(99);
        array.display();
    }
}
