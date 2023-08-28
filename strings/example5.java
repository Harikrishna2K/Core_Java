package org.example.strings;
//get the character using substring
public class example5 {
    public static void main(String[] args) {
        String str = "Yoga as Kaasiraaman";
        //char ch = 'i';
        String str2 = "aint";
        int index = 5;
        System.out.println("Before changing the String : " + str);


        str = str.substring(0,index) + str2+ str.substring(index + 1);
        System.out.println("Print the syntax " + str);
    }
}
