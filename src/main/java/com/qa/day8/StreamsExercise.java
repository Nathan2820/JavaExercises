package com.qa.day8;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsExercise {

    public static void main(String[] args) {
        StreamsExercise streams = new StreamsExercise();
        streams.loopThroughNames();
        streams.reduceList();
        streams.streamExamples();
    }

    public List<String> loopThroughNames() {
        List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
        List<String> helloNames =
                names.stream()
                    .map(str -> ("Hello " + str))
                    .collect(Collectors.toList());
        helloNames.forEach(System.out::println);
        return helloNames;
    }

    public int reduceList() {
        List<Integer> numbers = Arrays.asList(3,4,7,8,12);
        int result =
                numbers.stream()
                    .reduce((a,b) -> a*b)
                    .get();
        System.out.println(result);
        return result;
    }

    public int streamExamples() {
        List<Integer> numbers = Arrays.asList(12,8,10,17,5,31);
        int max =
                numbers.stream()
                    .max(Integer::compare)
                    .get();
        System.out.println(max + "\n");
        int min =
                numbers.stream()
                    .min(Integer::compare)
                    .get();
        System.out.println(min + "\n");
        List<Integer> evens =
                numbers.stream()
                    .filter(x -> x % 2 == 0)
                    .collect(Collectors.toList());
        evens.forEach(System.out::println);
        System.out.println();
        List<Integer> odds =
                numbers.stream()
                        .filter(x -> x % 2 != 0)
                        .collect(Collectors.toList());
        odds.forEach(System.out::println);
        System.out.println();
        int sum =
                numbers.stream()
                    .reduce(0, Integer::sum);
        System.out.println(sum + "\n");
        List<Integer> oddsSquared =
                numbers.stream()
                    .map(x -> x*x)
                    .filter(x -> x % 2 != 0)
                    .collect(Collectors.toList());
        int minValue =
                oddsSquared.stream()
                    .min(Integer::compare)
                    .get();
        System.out.println(minValue + "\n");
        return max;
    }

}
