package com.example.mpp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MppApplication {

    public static void main(String[] args) {
        /*ArrayList<String>
                stringList = new ArrayList<>(Arrays.asList("sujan", "ram", "hari", "hari", "sujan"));
        Mpp.removeDuplicates(stringList);


        ArrayList<Integer>
                numberList = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 4, 5, 5));
        Mpp.removeDuplicates(numberList);

        int[] testArray = new int[]{5, 1};
        System.out.println("--- Test for sum result :" + Mpp.testForSum(testArray, 88));


        CustomLinkedList<String> list = new CustomLinkedList();
        list.add( "sujan");
        list.add( "koju");
        list.printData();
        System.out.println(list.isPresent("asd"));
*/
/*

        MyArrayList<Integer> nos = new MyArrayList<>();
        nos.add(1);
        nos.add(2);
        nos.add(3);

        nos.print();
        System.out.println("");
        nos.remove(0);

        nos.print();
*/

/*

        MyStack<String> names = new MyStack<>();
        names.push("sujan");
        names.push("suman");
        names.push("hari");
        names.print();

        System.out.println("");

        names.pop();
        names.pop();
        names.pop();
        names.print();
*/

        MyQueue<String> names = new MyQueue<>();
        names.enqueue("sujan");
        names.enqueue("suman");
        names.enqueue("hari");

        names.print();


        System.out.println("");

        names.dequeue();
        names.dequeue();
        names.dequeue();
        names.dequeue();
        names.print();

        SpringApplication.run(MppApplication.class, args);
    }


}
