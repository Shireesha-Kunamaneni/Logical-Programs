package com.sirisha.logical.java8;

import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
public class AmstrongNumber {

	public static List<Integer> generate(int series) {
        return Stream.iterate(1, i -> ++i)
                .filter(i -> i == Stream.of(String.valueOf(i).split(""))
                        .map(Integer::valueOf)
                        .map(n -> (n*n*n))
                        .mapToInt(n -> n)
                        .sum())
                .limit(series)
                .collect(toList());
    }

    public static void main(String[] args) {
        List<Integer> generate = AmstrongNumber.generate(5);
        System.out.println(generate);
    }
}