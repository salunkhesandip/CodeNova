package com.cleancoders.features.java.codenova.service.lts17.patternmatching;

import org.springframework.stereotype.Service;

@Service
public class ShapeService {
    public double calculateCircleArea() {
        Shape shape = new Circle(10);
        return shape.getAreaOfShape(shape);
    }

    public double calculateRectangleArea() {
        Shape shape = new Rectangle(10, 20);
        return shape.getAreaUsingCase(shape);
    }

    public void test(Object obj) {
        switch (obj) {
            case Integer i when i > 0-> System.out.println("Positive Number");
            case Integer i -> System.out.println("Zero or Negative Number");
            case null, default -> System.out.println("Not a Number");
        }
    }

    public void error1(Integer number) {
        switch (number) {
            case 10 -> System.out.println("Number 1"); // Label is dominated by a preceding case label 'Integer i'
            case Integer i -> System.out.println("Positive Number");
        }
    }
    public void testInteger(Integer number) {
        switch (number) {
            case Integer i when i > 0 -> System.out.println("Integer Number");
            case 1 -> System.out.println("Number 1");
            default -> System.out.println("Zero or Negative Number");
        }
    }
}
