package org.example.Interfaces;

interface AI{
    void newFunctionalities();

}
interface MyInterface extends AI {

    private void goLeft(){
    };
    void goRight();

    void goStraight();
}

class AI_Robot extends Robot{


}


class Robot implements MyInterface{


    @Override
    public void goRight() {
        System.out.println("It is going right");
    }

    @Override
    public void goStraight(){
        System.out.println("It is going straight");
    }

    @Override
    public void newFunctionalities() {
        System.out.println("It can jump");
    }
}

