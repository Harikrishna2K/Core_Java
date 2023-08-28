package org.example.strings;
//reverse the String
public class example1 {

    public static void main(String args[]){

        String str = "Aspire Systems";
        char ch;
        String nstr = "";
        System.out.println("The word before reversing !!");
        System.out.println("Aspire Systems");



        for(int i = 0; i<str.length(); i++){
            ch = str.charAt(i); //extract the string in the given character//
            nstr = ch + nstr; //Store the given String in this nstr//
        }

        System.out.println("The reversed word is: " + nstr);
    }
}
