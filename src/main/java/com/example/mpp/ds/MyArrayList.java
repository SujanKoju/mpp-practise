package com.example.mpp.ds;

/**
 * @author kojusujan1111@gmail.com 27/10/21
 */

public class MyArrayList<T> {
    public int size;
    public static int initial_capacity = 5;
    public T[] data = (T[]) new Object[initial_capacity];

    public void add(T element) {
        ensureCapacity();
        data[size] = element;
        size++;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            T[] newData = (T[]) new Object[initial_capacity * 2 + 1];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    public T remove(int index) {
        checkIndex(index);
        T removedData = data[index];
        for (int i = index; i < size-1; i++) {
            data[i] = data[i + 1];
        }
        data[size-1] = null;
        size--;
        return removedData;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void print() {
        if (size!=0){
            if (size>1){
                for (int i = 0; i <= size - 2; i++) {
                    System.out.print(data[i] + ",");
                }
            }
            System.out.print(data[size-1]);
        }
    }

}
