package org.example.Overriding;

class parent{
    protected void display(){
        System.out.println("Parent method 1");
    }

    private void show(){
        System.out.println("Parent method of 2");
    }
}

class Child extends parent{

    @Override
    public void display(){
        System.out.println("Child method!!");
    }


    @Override
    private void show(){
        System.out.println("Child method of 2");
    }
}
public class Main {
    public static void main(String args[]){
        parent obj1 = new Child();
        obj1.show();
//        Child obj2 = new parent();


    }
}
