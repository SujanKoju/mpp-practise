package com.example.mpp.ds;

import java.util.List;

public class Mpp {

    public static <T> void removeDuplicates(List<T> list) {
        System.out.println("--- INITIAL LIST -->" + list);
        if (list == null) {
            System.out.println("NULL");
        }
        if (list.size() > 1) {

            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j))) {
                        list.remove(j);
                    }
                }
            }
        }
        System.out.println("--- FINAL LIST -->" + list);
    }

    public static boolean testForSum(int[] intArr, int testInt) {
        if (intArr == null || intArr.length < 3) return false;
        for (int i = 0; i < intArr.length - 2; i++) {
            for (int j = i + 1; j < intArr.length - 1; j++) {
                for (int k = j + 1; j < intArr.length; j++) {
                    if (intArr[i] + intArr[j] + intArr[k] == testInt) return true;
                }
            }
        }
        return false;
    }
}
