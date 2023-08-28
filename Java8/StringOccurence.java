package org.example.Java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * Print the occurences of each character in a string using java 8
 *
 * */
public class StringOccurence {
    public static void main(String occurencesprogram[]){
        String str = "HariKrishnaS";

        getTheoccurences(str);

    }

    public static void getTheoccurences(String str){
        Map<String, Long> mp= Arrays.stream(str.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


    }


}
