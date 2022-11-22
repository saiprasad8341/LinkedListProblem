package com.bridgelab;

//UC5 - Ability to delete the first element in the of sequence 56->30->70

import java.util.LinkedList;

public class LinkedListExm {
    public static void main(String[] args) {
        System.out.println("Welcome to the LinkedList Problem...");
        LinkedList<String> list = new LinkedList<>();
        list.add("56");
        list.add("30");
        list.add("70");
        System.out.println("List ::: "+list);
        list.removeFirst();
        System.out.println("Updated list ::: "+list);
    }
}
