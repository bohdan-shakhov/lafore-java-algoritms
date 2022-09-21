package com.knubisoft.chapter_5_linked_lists;

public class LinkList {

    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id, double dd) {
        Link link = new Link(id, dd);
        link.next = first;
        first = link;
    }

    public Link deleteFirst() {
        Link link = first;
        first = first.next;
        return link;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

}
