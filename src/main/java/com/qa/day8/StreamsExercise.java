package com.qa.day8;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsExercise {

    public static void main(String[] args) {
        StreamsExercise streams = new StreamsExercise();
        streams.loopThroughNames();
    }

    public List<String> loopThroughNames() {
        List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
        List<String> helloNames =
                names.stream()
                    .map(str -> ("Hello " + str))
                    .collect(Collectors.toList());
                helloNames
                    .forEach(System.out::println);
        return helloNames;
    }

}
