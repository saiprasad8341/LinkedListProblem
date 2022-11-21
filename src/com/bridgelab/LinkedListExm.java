package com.bridgelab;

//UC9 - Ability to delete 40 from the Linked List sequence of 56->30->40->70 and show the size of LinkedList is 3

import java.util.LinkedList;

public class LinkedListExm {
    public static void main(String[] args) {
        System.out.println("Welcome to the LinkedList Problem...");
        LinkedList<String> list = new LinkedList<>();
        list.add("56");
        list.add("30");
        list.add("70");
        System.out.println("List ::: "+list);
        list.add(list.indexOf("30"), "40");
        list.remove(list.indexOf("40"));
        System.out.println("Updated list ::: "+list);
        System.out.println("Size ::: "+list.size());
    }
}
