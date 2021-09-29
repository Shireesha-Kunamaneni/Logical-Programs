package com.sirisha.logical.java8;

import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class FibonacciSeries {

	public static List<Integer> getFibonacci(int series) {
        return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(series)
                .map(n -> n[0])
                .collect(toList());
    }

    public static void main(String[] args) {

        List<Integer> fibonacci = getFibonacci(10);
        fibonacci.forEach(x -> System.out.println(x));

    }
}