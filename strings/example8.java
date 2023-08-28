package org.example.strings;

import java.sql.SQLOutput;

//To check the perfomance of string builder and string buffer//
public class example8 {
    public static void main(String[] args) {


        long startTime = System.currentTimeMillis();


        StringBuffer sbf = new StringBuffer("Hello");

        for(int i = 0 ; i < 1000000; i++){
            sbf.append("world");
        }
        System.out.println("The Time performance of string buffer is : " + (System.currentTimeMillis() - startTime));


        startTime = System.currentTimeMillis();
        StringBuilder sbd = new StringBuilder("Hello");

        for(int i = 0 ; i < 10000; i++){
            sbd.append("world");
        }
        System.out.println("The performance of string builder is : " + (System.currentTimeMillis() - startTime));


    }
}
