package com.shakhawat.ocp;

/**
 * Open-Closed Principle
 * <p>
 * Classes should be open for extension but closed for modification.
 * Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
 */

class Shape {
    public String type;
    public double length;
    public double radius;
}
class AreaCalculator {
    public double calculateArea(Shape shape) {
        if(shape.type.equalsIgnoreCase("square")) {
            return shape.length * shape.length;
        } else if(shape.type.equalsIgnoreCase("circle")) {
            return 3.14 * shape.radius * shape.radius;
        } else {
            return 0;
        }
    }
}

public class BeforeOCP {

    public static void main(String[] args) {
        Shape square = new Shape();
        square.type = "square";
        square.length = 10;

        Shape circle = new Shape();
        circle.type = "circle";
        circle.radius = 5;

        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println(areaCalculator.calculateArea(square));
        System.out.println(areaCalculator.calculateArea(circle));
    }
}
