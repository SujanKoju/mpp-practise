package com.example.mpp;

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
      /*  if (index < 0 || index >= size) {*/
      /*      throw new ArrayIndexOutOfBoundsException();*/
      /*  }*/
      /*  if (index == 0) {*/
      /*      head = head.next;*/
      /*  }*/
      /*  Node<T> tempNode = head;*/
      /*  for (int i = 0; i < index-1; i++) {*/
      /*      tempNode = tempNode.next;*/
      /*  }*/
      /*  Node<T> nodeToBeRemoved = tempNode.next;*/
      /*  tempNode.next = nodeToBeRemoved.next;*/
      /*  head = tempNode;*/
      /*  size--;*/
    }

    public void printData() {
        Node<T> tempNode = this.head;
        while (tempNode.next != null) {
            System.out.print(tempNode.data + "-->");
            tempNode = tempNode.next;
        }


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
}
