package org.example.Interfaces;

interface InterDemo{

    static void demo(){
        System.out.println("You can say hello by static interface!!!");
    }

    void vanakkam();
}
public class InterfaceDemo2 implements InterDemo {

    public static void main(String[] args) {
        InterfaceDemo2 intd = new InterfaceDemo2();
        InterDemo.demo();;
        intd.vanakkam();
    }
    @Override
    public void vanakkam() {
        System.out.println("He says vanakam!!!");

    }
}
