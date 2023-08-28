package org.example.Overriding;

class Parent {

        void display(){
            System.out.println("Parent method ");
        }

}

class Student extends Parent{

    @Override
    void display(){
        System.out.println("Children method!");
    }

}

public class Teacher{
    public static void main(String args[]){
        Parent p = new Student();
        p.display();
    }
}
