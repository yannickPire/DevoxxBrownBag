package org.example.patternMatching;

import org.example.patternMatching.models.Circle;
import org.example.patternMatching.models.Rectangle;
import org.example.patternMatching.models.Shape;
import org.example.patternMatching.models.Triangle;

public class main {

    public static void main(String[] args) {
        Shape shape = new Circle(5);
        System.out.println(processShapeSwitch(shape));
    }

    private static String processShapeSwitch(Shape shape) {
         return switch (shape){
            case Circle(int radius) -> String.valueOf(radius);
            case Rectangle rectangle -> rectangle.toString();
            case Triangle triangle -> triangle.toString();
            default -> throw new IllegalStateException("Unexpected value: " + shape); // Not necessary due to sealed classes
         };
    }

    private static String processShapeIf(Shape shape) {
        if(shape instanceof Circle circle){
            return circle.toString();
        } else if (shape instanceof Rectangle rectangle){
            return rectangle.toString();
        } else if (shape instanceof Triangle triangle) {
            return triangle.toString();
        }
        throw new IllegalStateException("Unexpected value: " + shape);
    }

}
