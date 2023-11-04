package com.cleancoders.features.java.codenova.controller;

import com.cleancoders.features.java.codenova.service.lts17.patternmatching.ShapeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java21")
public class LTS21Controller {
    private final ShapeService shapeService;

    public LTS21Controller(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @GetMapping(value = "/patternmatching/case/area")
    ResponseEntity<Double> calculateRectangleArea() {
        return ResponseEntity.ok(shapeService.calculateRectangleArea());
    }

    @GetMapping(value = "/patternmatching/guarded")
    ResponseEntity<Void> test() {
        shapeService.test("");
        return ResponseEntity.noContent().build();
    }
}
