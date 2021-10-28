package com.example.mpp.ds;

/**
 * @author kojusujan1111@gmail.com 27/10/21
 */

public class MyQueue<T> {
    public MyArrayList<T> list;

    public MyQueue() {
        this.list = new MyArrayList<>();
    }

    public void enqueue(T element) {
        this.list.add(element);
    }

    public T dequeue() {
        if (list.size <= 0) System.out.println("QUEUE EMPTY");
        return this.list.remove(0);
    }

    public void print() {
        list.print();
    }
}
