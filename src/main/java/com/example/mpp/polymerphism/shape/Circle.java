package com.example.mpp.polymerphism.shape;

/**
 * @author kojusujan1111@gmail.com 28/10/21
 */

public class Circle implements Shape {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public float computeArea() {
        return (float) (3.1428 * (this.radius * this.radius));
    }
}
