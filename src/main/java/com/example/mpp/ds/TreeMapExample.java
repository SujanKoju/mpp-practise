package com.example.mpp.ds;

import java.util.TreeMap;

/**
 * @author kojusujan1111@gmail.com 27/10/21
 */

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(101, "sujan");
        treeMap.put(104, "john");
        treeMap.put(102, "suman");
        treeMap.put(105, "mika");
        treeMap.put(103, "aarash");

        treeMap.forEach((id, name) -> {
            System.out.println("ID = " + id + " Name = " + name);
        });
    }
}
