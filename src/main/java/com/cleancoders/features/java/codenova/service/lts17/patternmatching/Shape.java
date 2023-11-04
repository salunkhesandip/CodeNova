package com.cleancoders.features.java.codenova.service.lts17.patternmatching;

public interface Shape {
    default double getAreaOfShape(Shape shape) { // Without pattern matching
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.length() * r.width();
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return Math.PI * Math.pow(c.radius(), 2);
        } else {
            throw new IllegalArgumentException("Unknown shape");
        }
    }
    default double getArea(Shape shape) {
        if (shape instanceof Rectangle r) {
            return r.length() * r.width();
        } else if (shape instanceof Circle c) {
            return Math.PI * Math.pow(c.radius(), 2);
        } else {
            throw new IllegalArgumentException("Unknown shape");
        }
    }
    default double getAreaUsingCase(Shape shape) {
        return switch (shape) {
            case Rectangle r -> r.length() * r.width();
            case Circle c-> Math.PI * Math.pow(c.radius(), 2);
            default -> throw new IllegalArgumentException("Unknown shape");
        };
    }

    default double getAreaScope(Shape shape) {
        if (shape instanceof Rectangle s) {
            // You can use the pattern variable s of type Rectangle here.
            return s.length() * s.width();
        } else if (shape instanceof Circle s) {
            // You can use the pattern variable s of type Circle here
            // but not the pattern variable s of type Rectangle.
            return Math.PI * Math.pow(s.radius(), 2);
        } else {
            // You cannot use either pattern variable here.
            throw new IllegalArgumentException("Unknown shape");
        }
    }
}
