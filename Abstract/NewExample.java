package org.example.Abstract;

abstract class Server{
   abstract void status ();

    void working(){
        System.out.println("It is on good working condition!!!");
    }

    abstract class detailsofserver{
        abstract void otherservers();
    }

}
public class NewExample extends Server {

    public static void main(String[] args) {
        Server s;
        NewExample ne = new NewExample();
        ne.working();
        ne.status();

    }
    @Override
    void status() {
        System.out.println("Status code : Good Condition!!!");
    }
}
