package org.example.strings;
/*
* Replace a character at a specific index in a String in Java using substring method*/
public class example4 {
    public static void main(String[] args) {
        String str = "TVH Auranaya Bay";

        int index = 4;
        char ch = 'O';
        System.out.println("The original String is: " + str);

        str = str.substring(0,index) + ch + str.substring(index + 1);
        System.out.println("The Modified String is " + str);


    }
}
