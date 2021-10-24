package com.example.mpp;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author kojusujan1111@gmail.com 24/10/21
 */
import java.util.List;

public class Number1 {

    public static <T> void removeDuplicates(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }
        System.out.println("--- FINAL LIST -->" + list);
    }
}
