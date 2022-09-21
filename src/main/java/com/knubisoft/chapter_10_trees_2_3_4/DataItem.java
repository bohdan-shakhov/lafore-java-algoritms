package com.knubisoft.chapter_10_trees_2_3_4;

public class DataItem {
    public long dData;

    public DataItem(long dData) {
        this.dData = dData;
    }

    public void displayItem() {
        System.out.print("/" + dData);
    }
}
