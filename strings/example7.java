package org.example.strings;
//String builder and String buffer//
public class example7 {
    public static void main(String args[])
    {
        StringBuilder sbf = new StringBuilder("Hello");
        sbf.append("world");
        System.out.println(sbf);


        StringBuffer sbff = new StringBuffer("Hello");
        sbff.append("world");
        System.out.println(sbf);
    }

}
