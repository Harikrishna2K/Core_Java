package org.example.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main (String args[]){
        List<String> rs = Arrays.asList("Hey", null, "hi", null , "vanakkam");
        List<String> rs2 =
                rs.stream().filter(w ->w !=null).collect(Collectors.toList());
        System.out.println(rs2);
    }
}
