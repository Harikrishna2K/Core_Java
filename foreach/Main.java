package org.example.foreach;

public class Main {

    public static int maximum(int[] numbers){
        int maxinumbers = numbers[0];

        for(int num : numbers){
             if (num > maxinumbers){
                 maxinumbers = num;
             }

        }
        return  maxinumbers;
    }
    public static void main(String[] args) {
        int[] marks = {125,132,165,212,200};

        int highestmarks = maximum(marks);
        System.out.println("The maximum marks is : " + highestmarks);
    }
}
