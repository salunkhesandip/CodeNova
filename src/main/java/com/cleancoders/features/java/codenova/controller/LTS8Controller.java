package com.cleancoders.features.java.codenova.controller;

import com.cleancoders.features.java.codenova.service.LTS8Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

@RestController
@RequestMapping("/java8")
public class LTS8Controller {
    private final LTS8Service lts8Service;

    public LTS8Controller(LTS8Service lts8Service) {
        this.lts8Service = lts8Service;
    }

    @GetMapping(value = "/streams/primitive/integer")
    public ResponseEntity<IntStream> getIntegerStream() {
        return ResponseEntity.ok(lts8Service.getIntegerStream());
    }

    @GetMapping(value = "/streams/primitive/long")
    public ResponseEntity<LongStream> getLongStream() {
        return ResponseEntity.ok(lts8Service.getLongStream());
    }

    @GetMapping(value = "/streams/primitive/double")
    public ResponseEntity<DoubleStream> getDoubleStream() {
        return ResponseEntity.ok(lts8Service.getDoubleStream());
    }

    @GetMapping(value = "/streams/primitive/event/integer")
    public ResponseEntity<IntStream> getEvenIntegerStream() {
        return ResponseEntity.ok(lts8Service.getEvenIntegerStream());
    }

    @GetMapping(value = "/streams/primitive/squareInt")
    public ResponseEntity<IntStream> getSquareIntegerStream() {
        return ResponseEntity.ok(lts8Service.getSquareIntegerStream());
    }

    @GetMapping(value = "/streams/primitive/sortedInt")
    public ResponseEntity<IntStream> getSortedIntegerStream() {
        return ResponseEntity.ok(lts8Service.getSortedIntegerStream());
    }

    @GetMapping(value = "/streams/primitive/reverseSortedInt")
    public ResponseEntity<List<Integer>> getReverseSortedIntegerStream() {
        return ResponseEntity.ok(lts8Service.getReverseSortedIntegerStream());
    }

    @GetMapping(value = "/streams/primitive/flatMap")
    public ResponseEntity<List<Integer>> getflatMapStream() {
        return ResponseEntity.ok(lts8Service.getflatMapStream());
    }
    @GetMapping(value = "/streams/primitive/distinct")
    public ResponseEntity<IntStream> getDistinctStream() {
        return ResponseEntity.ok(lts8Service.getDistinctStream());
    }

    @GetMapping(value = "/streams/primitive/peek")
    public ResponseEntity<IntStream> getPeekStream() {
        return ResponseEntity.ok(lts8Service.getPeekStream());
    }

    @GetMapping(value = "/streams/primitive/limit")
    public ResponseEntity<IntStream> getLimitStream() {
        return ResponseEntity.ok(lts8Service.getLimitStream());
    }

    @GetMapping(value = "/streams/primitive/forEach")
    public ResponseEntity<Void> getForEach() {
        lts8Service.getForEach();
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/streams/primitive/forEachOrdered")
    public ResponseEntity<IntStream> getForEachOrdered() {
        lts8Service.getForEachOrdered();
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/streams/primitive/toArrayInt")
    public ResponseEntity<int[]> toArrayIntStream() {
        return ResponseEntity.ok(lts8Service.toArrayIntStream());
    }

    @GetMapping(value = "/streams/primitive/toArrayString")
    public ResponseEntity<String[]> toArrayStringStream() {
        return ResponseEntity.ok(lts8Service.toArrayStringStream());
    }

    @GetMapping(value = "/streams/collect")
    public ResponseEntity<List<String>> collectStreamToList() {
        return ResponseEntity.ok(lts8Service.collectStreamToList());
    }

    @GetMapping(value = "/streams/primitive/reduce")
    public ResponseEntity<Integer> reduceStream() {
        return ResponseEntity.ok(lts8Service.reduceStream());
    }

    @GetMapping(value = "/streams/primitive/count")
    public ResponseEntity<Long> countStream() {
        return ResponseEntity.ok(lts8Service.countStream());
    }

    @GetMapping(value = "/streams/primitive/min")
    public ResponseEntity<OptionalInt> minStream() {
        return ResponseEntity.ok(lts8Service.minStream());
    }

    @GetMapping(value = "/streams/primitive/anyMatch")
    public ResponseEntity<Boolean> anyMatchStream() {
        return ResponseEntity.ok(lts8Service.anyMatchStream());
    }

    @GetMapping(value = "/streams/primitive/noneMatch")
    public ResponseEntity<Boolean> noneMatchStream() {
        return ResponseEntity.ok(lts8Service.noneMatchStream());
    }

    @GetMapping(value = "/streams/primitive/allMatch")
    public ResponseEntity<Boolean> allMatchStream() {
        return ResponseEntity.ok(lts8Service.allMatchStream());
    }

    @GetMapping(value = "/streams/primitive/findAny")
    public ResponseEntity<OptionalInt> findAnyStream() {
        return ResponseEntity.ok(lts8Service.findAnyStream());
    }

    @GetMapping(value = "/streams/primitive/findFirst")
    public ResponseEntity<OptionalInt> findFirstStream() {
        return ResponseEntity.ok(lts8Service.findFirstStream());
    }

    @GetMapping(value = "/functionalInterface/area/{length}")
    public ResponseEntity <Integer> findAnyStream(@PathVariable int length) {
        return ResponseEntity.ok(lts8Service.calculateSquareArea(length));
    }

    @GetMapping(value = "/functionalInterface/upper/{name}")
    public ResponseEntity <String> functionUpperCase(@PathVariable String name) {
        return ResponseEntity.ok(lts8Service.functionUpperCase(name));
    }

    @GetMapping(value = "/functionalInterface/predicate/iseven/{number}")
    public ResponseEntity <Boolean> predicateIsEven(@PathVariable Integer number) {
        return ResponseEntity.ok(lts8Service.predicateIsEven(number));
    }

    @GetMapping(value = "/functionalInterface/consumer/print/{number}")
    public ResponseEntity <Void> printNumber(@PathVariable Integer number) {
        lts8Service.printNumber(number);
        return ResponseEntity.noContent().build();
    }
    @GetMapping(value = "/functionalInterface/supplier/random")
    public ResponseEntity <Integer> generateRandomNumber() {
        return ResponseEntity.ok(lts8Service.generateRandomNumber());
    }

    @GetMapping(value = "/functionalInterface/bifunction/num1/{num1}/num2/{num2}")
    public ResponseEntity <Integer> getSumBiFunction(@PathVariable int num1, @PathVariable int num2) {
        return ResponseEntity.ok(lts8Service.getSumBiFunction(num1, num2));
    }

    @GetMapping(value = "/functionalInterface/bipredicate/num1/{num1}/num2/{num2}")
    public ResponseEntity <Boolean> areEqualNumbers(@PathVariable int num1, @PathVariable int num2) {
        return ResponseEntity.ok(lts8Service.areEqualNumbers(num1, num2));
    }

    @GetMapping(value = "/functionalInterface/binaryOperator/num1/{num1}/num2/{num2}")
    public ResponseEntity <Integer> getMin(@PathVariable int num1, @PathVariable int num2) {
        return ResponseEntity.ok(lts8Service.getMin(num1, num2));
    }

    @GetMapping(value = "/functionalInterface/unaryOperator/num/{num}")
    public ResponseEntity <Integer> getMin(@PathVariable int num) {
        return ResponseEntity.ok(lts8Service.getNumberSquare(num));
    }

    @GetMapping(value = "/functionalInterface/biconsumer/print/num1/{num1}/num2/{num2}")
    public ResponseEntity <Void> printNumbers(@PathVariable Integer num1,
                                             @PathVariable Integer num2) {
        lts8Service.printNumbers(num1, num2);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/functionalInterface/runnable/print")
    public ResponseEntity <Void> runnableTask() {
        lts8Service.runnableTask();
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/functionalInterface/callable/print")
    public ResponseEntity <Integer> callableTask() throws Exception {
        return ResponseEntity.ok(lts8Service.callableTask());
    }

    @GetMapping(value = "/functionalInterface/comparator/sort")
    public ResponseEntity<List<Integer>> comparatorSort() {
        return ResponseEntity.ok(lts8Service.comparatorSort());
    }
}
