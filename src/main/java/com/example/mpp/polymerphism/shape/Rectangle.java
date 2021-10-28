package com.example.mpp.polymerphism.shape;

/**
 * @author kojusujan1111@gmail.com 28/10/21
 */

public class Rectangle implements Shape {
    public int length;
    public int breath;

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public Rectangle() {
    }

    @Override
    public float computeArea() {
        return this.length * this.breath;
    }
}
