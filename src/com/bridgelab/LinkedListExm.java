package com.bridgelab;

//UC8 - Ability to insert 40 after 30 to the Linked List sequence of 56->30->70

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
        System.out.println("Updated list ::: "+list);
    }
}
