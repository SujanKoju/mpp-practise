package com.example.mpp;

/**
 * @author kojusujan1111@gmail.com 25/10/21
 */

public class LinkedList<T> {
    public Node<T> head;

    public  void add(T data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (this.head == null) {
            this.head = node;
        } else {
            Node lastNode = this.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    public void printData() {
        Node lastNode = this.head;
        while (lastNode != null) {
            System.out.println(lastNode.data + "-->");
            lastNode = lastNode.next;
        }
    }

    public boolean isPresent(T data) {
        if (this.head == null) return false;
        Node lastNode = this.head;
        while (lastNode.next != null) {
            if (lastNode.data == data) return true;
            lastNode = lastNode.next;
        }
        return false;
    }
}
