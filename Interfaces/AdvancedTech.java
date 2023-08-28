package org.example.Interfaces;

interface ArtificialIntelligence{

    void AIalgo();
}
interface ControlSystems {

    //Java 9 features //
    private void manualReadable(){
        System.out.println("It should be not be given to people under the age of 18!");
    };
    void goStraight();
    void goUp();
    void getDown();

    //static methods in Interface//
    static void machinereadable(){
        System.out.println("Reads machine code!");
    };

    //we can use default methods in interface//
    default void maindescription(){
        System.out.println("It should not be subjected to water !!");
        manualReadable();
    }
}

//Multiple inheritance using interface//
class MyRobot implements ControlSystems, ArtificialIntelligence{

    @Override
    public void getDown() {
        System.out.println("Go down!!");
    }

    @Override
    public void goUp() {
        System.out.println("Go Up!!");
    }

    @Override
    public void goStraight() {
        System.out.println("Go Straight!!");
    }

    @Override
    public void AIalgo() {
        System.out.println("Using the AI Algo");
    }

    //ControlSystems.machinereadable();


}

class MyCustomSettings extends MyRobot implements ControlSystems{
    void customAI(){
        System.out.println("This works on its custom ai");
    }
}


public class AdvancedTech  {
    public static void main(String[] args) {
        MyCustomSettings ms = new MyCustomSettings();
        MyRobot mr = new MyRobot();
        mr.goStraight();
        ms.customAI();
    }
}
