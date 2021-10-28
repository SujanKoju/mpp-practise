package com.example.mpp.polymerphism.shape;

/**
 * @author kojusujan1111@gmail.com 28/10/21
 */

public class Test {


    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Shape[] shapes = {circle, rectangle};
        System.out.println("AVERAGE AREA == " + Test.computeAverageArea(shapes));
    }

    public static float computeAverageArea(Shape[] shapes) {
        float sumOfAreas = 0;
        for (Shape shape : shapes) {
            sumOfAreas = sumOfAreas + shape.computeArea();
        }
        return sumOfAreas / shapes.length;
    }
}
