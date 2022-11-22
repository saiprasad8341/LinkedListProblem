package com.bridgelab;

//UC10 - Ability to create Ordered Linked List in ascending order of data entered in following sequence 56, 30, 40, and 70

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExm {
    static LinkedList<String> list = new LinkedList<>();

    public static void print(LinkedList<String> elements){
        for (String element : elements){
            System.out.print(element);
            System.out.print(" => ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the LinkedList Problem...");

        list.add("56");
        list.add("30");
        list.add("90");
        list.add("80");
        list.add("70");
        print(list);
        list.add(list.indexOf("30"), "40");
        System.out.println("Adding in middle ::::::::");
        print(list);
        list.remove(list.indexOf("40"));
        System.out.println("Deleting in middle :::::::::");
        print(list);
        System.out.println("Size ::: "+list.size());
        Collections.sort(list);
        System.out.println("Ascending order :::::::: ");
        print(list);
    }
}
