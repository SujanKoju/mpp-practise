package com.example.mpp.ds;

import java.util.LinkedList;

/**
 * @author kojusujan1111@gmail.com 25/10/21
 */

public class MyLinkedList<T> {
    public Node<T> head;
    public int size;

    public void add(T data) {
        Node<T> node = new Node<T>();
        node.data = data;
        node.next = null;
        if (this.head == null) {
            this.head = node;
        } else {
            Node<T> lastNode = this.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> previous = head;
            int count = 1;
            while (count < index) {
                previous = previous.next;
                count++;
            }
            Node<T> current = previous.next;
            previous.next = current.next;
            current.next = null;
        }
        size--;
    }

    public void printData() {
        Node<T> tempNode = this.head;
        while (tempNode.next != null) {
            System.out.print(tempNode.data + "-->");
            tempNode = tempNode.next;
        }
        System.out.print(tempNode.data);
    }

    public boolean isPresent(T data) {
        if (this.head == null) return false;
        Node<T> lastNode = this.head;
        while (lastNode.next != null) {
            if (lastNode.data == data) return true;
            lastNode = lastNode.next;
        }
        return false;
    }

    public void reverse(Node<T> node) {
        this.head = reverseLinkedList(head);
    }

    public Node<T> reverseLinkedList(Node<T> node) {
        if (node.next == null)
            return node;
        Node<T> newHead = reverseLinkedList(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }

    public MyLinkedList<String> atLeastTwice(MyLinkedList<String> list) {
        MyLinkedList<String> returnList = new MyLinkedList<>();

        Node<String> head = list.head;


        return returnList;
    }
}
