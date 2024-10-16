package com.shakhawat.ocp;

/**
 * Open-Closed Principle
 * <p>
 * Classes should be open for extension but closed for modification.
 * Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
 */

abstract class ObjectShape {
    public abstract double calculateArea();
}

class Square extends ObjectShape {
    public double length;
    @Override
    public double calculateArea() {
        return length * length;
    }
}

class Circle extends ObjectShape {
    public double radius;
    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class ObjectAreaCalculator {
    public double calculateArea(ObjectShape objectShape) {
        return objectShape.calculateArea();
    }
}

//New Class Rectangle not affecting Open-Closed Principle
class Rectangle extends ObjectShape {
    double length;
    double width;

    @Override
    public double calculateArea() {
        return length * width;
    }
}

//Now, if we want to add a new shape (like a Triangle), we just extend the Shape class without modifying existing code, adhering to OCP.

public class OpenClosedPrinciple {

    public static void main(String[] args) {
        ObjectAreaCalculator objectAreaCalculator = new ObjectAreaCalculator();

        Square square = new Square();
        square.length = 10;
        double areaSquare = objectAreaCalculator.calculateArea(square);
        System.out.println("Area of Square: " + areaSquare);

        Circle circle = new Circle();
        circle.radius = 5;
        double areaCircle = objectAreaCalculator.calculateArea(circle);
        System.out.println("Area of Circle: " + areaCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.width = 5;
        double areaRectangle = objectAreaCalculator.calculateArea(rectangle);
        System.out.println("Area of Rectangle: " + areaRectangle);

    }

}
