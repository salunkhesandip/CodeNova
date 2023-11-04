package com.cleancoders.features.java.codenova.service.lts17;

import com.cleancoders.features.java.codenova.dto.Person;
import org.springframework.stereotype.Service;

@Service
public class LTS17Service {
    public void printPerson() {
        Person person = new Person("Sandip", 35);
        System.out.println(person);
        Person person1 = new Person("Dummy", -1);
        System.out.println(person1);
    }

    public void printGenricOrderRecord() {
        record Order<T>(T product, double price) {
        }
        Order<String> stringOrder = new Order<>("Pen", 2.25);
        System.out.println(stringOrder);
    }

    public void useSealedClass() {
        Shape shape1 = new Circle();
        shape1.draw();
        Shape shape2 = new Triangle();
        shape2.draw();
    }
}
