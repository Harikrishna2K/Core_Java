package org.example.strings;

import java.sql.SQLOutput;

//difference between double equal too and .equals();
public class example6 {
    public static void main(String[] args) {

        String s1 = new String("Hari");
        String s2 = new String("Hari");

        System.out.println("-------------This is with == method:   ----------------");

        //checks the memory location
        if(s1 == s2){
            System.out.println("It is equal");
        }
        else
            System.out.println("It is not Equal");

        System.out.println("-------------This is with .equalsto() method:   ----------------");
        //checks character to character
        if(s1 .equals(s2)){
            System.out.println("It is equal");
        }
        else
            System.out.println("It is not Equal");


//        String s3 = "Kaasi";
//        String s4 = "Kaasi";
//
//        if(s3 .equals(s4)){
//            System.out.println("It is equal");
//        }
//        else
//            System.out.println("It is not equal");
    }



}
