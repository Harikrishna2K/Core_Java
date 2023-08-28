package org.example.strings;
/*
 * Get the index and the string
 * Get the specific character using String.toCharArray(index) method.
 * Return the specific character.
 */
public class example3A {

    private static char getCharacterfromstring(String string, int index ){
        return  string.toCharArray()[index];
    }

    public static void main(String[] args) {
        String s1 = "Harikrishna";
        int index = 5;
        char ch = getCharacterfromstring(s1,index);
        System.out.println("The name is " + s1 + "index is on " + "character is " + ch);
    }
}
