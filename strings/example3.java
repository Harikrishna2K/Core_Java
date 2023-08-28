package org.example.strings;

//get character from a string

//conditions are
/*
* Get the index and the string
* Get the specific character using String.charAt(index) method.
* Return the specific character.
*/
public class example3 {

   // write a function to return the specific index and the Strings//
    public static char getCharacter(String str , int index){
        return str.charAt(index);
    }

    public static void main(String[] args) {
        String str = "HariKrishna S";
        int index = 5;

       char ch =  getCharacter(str , index);
        System.out.println("The string for " + str + "The index is " + index + "And the character is "+ ch);

//        String str1 = "Hari Krishna ";
//        System.out.println(str1.charAt(5));
//        System.out.println(str1.substring(4));


    }
}
