package org.example.patternMatching.models;

public record Circle(int radius) implements Shape{

    @Override
    public String toString() {
        return "Circle";
    }
}
