package org.example.patternMatching.models;

public record Triangle() implements Shape{

    @Override
    public String toString() {
        return "Triangle";
    }
}
