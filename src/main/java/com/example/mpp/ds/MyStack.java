package com.example.mpp.ds;

/**
 * @author kojusujan1111@gmail.com 27/10/21
 */

public class MyStack<T> {
    public MyArrayList<T> list;

    public MyStack() {
        this.list = new MyArrayList<>();
    }

    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        if (list.size <= 0) {
            System.out.println("Stack is empty");
        }

        return list.remove(list.size - 1);
    }

    public void print() {
        list.print();
    }
}
