package com.knubisoft.chapter_2_arrays.ordered_array;

public class OrdArrayRunner {
    public static void main(String[] args) {
        OrdArray array = new OrdArray(6);
        array.display();
        array.insert(5);
        array.insert(3);
        array.insert(4);
        array.insert(2);
        array.insert(6);
        array.insert(1);

        array.display();

        System.out.println(array.find(4));
        System.out.println(array.find(10));

        array.delete(1);
        array.display();
        array.delete(6);
        array.display();
    }
}

