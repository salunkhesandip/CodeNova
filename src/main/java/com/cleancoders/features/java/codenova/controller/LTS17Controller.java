package com.cleancoders.features.java.codenova.controller;

import com.cleancoders.features.java.codenova.service.lts17.LTS17Service;
import com.cleancoders.features.java.codenova.service.lts17.patternmatching.ShapeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java17")
public class LTS17Controller {
    private final LTS17Service lts17Service;
    private final ShapeService shapeService;

    public LTS17Controller(LTS17Service lts17Service, ShapeService shapeService) {
        this.lts17Service = lts17Service;
        this.shapeService = shapeService;
    }

    @GetMapping(value = "/records/person")
    ResponseEntity<Void> printPersonRecord() {
        lts17Service.printPerson();
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/records/generic/order")
    ResponseEntity<Void> printGenricOrderRecord() {
        lts17Service.printGenricOrderRecord();
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/records/sealedClass")
    ResponseEntity<Void> useSealedClass() {
        lts17Service.useSealedClass();
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/patternmatching/instanceof/area")
    ResponseEntity<Double> calculateArea() {
        return ResponseEntity.ok(shapeService.calculateCircleArea());
    }
}
