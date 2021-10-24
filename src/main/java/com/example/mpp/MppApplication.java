package com.example.mpp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class MppApplication {

    public static void main(String[] args) {
        ArrayList<String>
                stringList = new ArrayList<>(
                Arrays
                        .asList("sujan", "ram", "hari", "hari", "sujan"));
        Number1.removeDuplicates(stringList);


        ArrayList<Integer>
                numberList = new ArrayList<>(
                Arrays
                        .asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        Number1.removeDuplicates(numberList);
        SpringApplication.run(MppApplication.class, args);
    }


}
