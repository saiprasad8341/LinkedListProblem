package com.bridgelab;

//UC7 - Ability to search LinkedList to find Node with value 30

import java.util.LinkedList;

public class LinkedListExm {
    public static void main(String[] args) {
        System.out.println("Welcome to the LinkedList Problem...");
        LinkedList<String> list = new LinkedList<>();
        list.add("56");
        list.add("30");
        list.add("70");
        System.out.println("List ::: "+list);
        list.removeLast();
        System.out.println("Updated list ::: "+list);
        System.out.println("Index of 30 is ::: "+ list.indexOf("30"));
    }
}
