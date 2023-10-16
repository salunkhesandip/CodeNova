package com.cleancoders.features.java.codenova.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

@Service
public class LTS8Service {
    public IntStream getIntegerStream() {
        return IntStream.of(1, 2, 3, 4, 10);
    }
    public LongStream getLongStream() {
        LongStream longStream = LongStream.of(1234567891, 22, 33, 44);
        return longStream.sorted();
    }
    public DoubleStream getDoubleStream() {
        return DoubleStream.of(1.0, 1.1, 2.2, 5);
    }

    public IntStream getEvenIntegerStream() {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 10);
        return intStream.filter(n -> n%2 == 0);
    }
    public IntStream getSquareIntegerStream() {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 10);
        return intStream.map(n -> n*n);
    }

    public IntStream getSortedIntegerStream() {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 10);
        return intStream.sorted();
    }
    public List<Integer> getReverseSortedIntegerStream() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 10);
        return numbers.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
    public List<Integer> getflatMapStream() {
        List<List<Integer>> nestedNumbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        return nestedNumbers.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public IntStream getDistinctStream() {
        IntStream intStream = IntStream.of(1, 2, 3, 3, 4, 4, 10);
        return intStream.distinct();
    }
    public IntStream getPeekStream() {
        IntStream intStream = IntStream.of(1, 2, 3, 3, 4, 4, 10);
        return intStream.map(n -> n*n).peek(n -> System.out.println("Mapped value : " + n));
    }

    public IntStream getLimitStream() {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 10);
        return intStream.skip(2);
    }

    public void getForEach() {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 10);
        intStream.forEach(System.out :: println);
    }

    public void getForEachOrdered() {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 10);
        intStream.parallel().forEachOrdered(System.out :: println);
    }

    public int[] toArrayIntStream() {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 10);
        return intStream.toArray();
    }
    public String[] toArrayStringStream() {
        List<String> words = Arrays.asList("one", "two", "three");
        return words.stream().toArray(String[] :: new);
    }

    public List<String> collectStreamToList() {
        Stream<String> words = Stream.of("one", "two", "three");
        return words.collect(Collectors.toList());
    }
    public Integer reduceStream() {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 10);
        return intStream.reduce(0, Integer::sum);
    }

    public Long countStream() {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 10);
        return intStream.count();
    }

    public OptionalInt minStream() {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 10);
        return intStream.min();
    }

    public boolean anyMatchStream() {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 10);
        return intStream.anyMatch(n -> n %2 == 0);
    }

    public boolean noneMatchStream() {
        IntStream intStream = IntStream.of(1, 3, 5, 7);
        return intStream.noneMatch(n -> n %2 == 0);
    }

    public boolean allMatchStream() {
        IntStream intStream = IntStream.of(1, 3, 5, 7);
        return intStream.allMatch(n -> n %2 == 1);
    }

    public OptionalInt findAnyStream() {
        IntStream intStream = IntStream.of(1, 3, 5, 7, 2, 22, 33, 44);
        return intStream.parallel().findAny();
    }

    public OptionalInt findFirstStream() {
        IntStream intStream = IntStream.of(1, 3, 5, 7);
        return intStream.findFirst();
    }

    public int calculateSquareArea(int x) {
        Square square = (int a) -> a*a;
        return square.calculateArea(x);
    }
    public String functionUpperCase(String name) {
        Function<String, String> upperCase = String::toUpperCase;
        return upperCase.apply(name);
    }

    public boolean predicateIsEven(int number) {
        Predicate<Integer> isEven = (i) -> i%2 == 0;
        return isEven.test(number);
    }

    public void printNumber(int number) {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(number);
    }


    public Integer generateRandomNumber() {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 1000);
        return supplier.get();
    }

    public Integer getSumBiFunction(int num1, int num2) {
        BiFunction<Integer, Integer, Integer> summation = (a, b) -> a + b;
        return summation.apply(num1, num2);
    }

    public boolean areEqualNumbers(int num1, int num2) {
        BiPredicate<Integer, Integer> areEqual = (a, b) -> Objects.equals(a, b);
        return areEqual.test(num1, num2);
    }

    public Integer getMin(int num1, int num2) {
        BinaryOperator<Integer> min = (a, b) -> Math.min(a, b);
        return min.apply(num1, num2);
    }

    public Integer getNumberSquare(int num) {
        UnaryOperator<Integer> square = (a) -> a*a;
        return square.apply(num);
    }

    public void printNumbers(int num1, int num2) {
        BiConsumer<Integer, Integer> print = (a, b) -> {
            System.out.println("First Number :" + a);
            System.out.println("Second Number : " +b);
        };
        print.accept(num1,num2);
    }

    public void runnableTask() {
        Runnable runnable = () -> System.out.println("Running a task.");
        runnable.run();
    }

    public Integer callableTask() throws Exception {
        Callable<Integer> callable = () -> 100;
        return callable.call();
    }
    public List<Integer> comparatorSort() {
        List<Integer> numbers = Arrays.asList(1, 10, 2, 20, 3, 30);
        Comparator<Integer> reverseOrderComparator = (n1, n2) -> n2.compareTo(n1);
        Collections.sort(numbers, reverseOrderComparator);
        return numbers;
    }
}
