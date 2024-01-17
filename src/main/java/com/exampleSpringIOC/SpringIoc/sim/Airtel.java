package com.exampleSpringIOC.SpringIoc.sim;

public class Airtel implements Sim {
    Airtel(){
        System.out.println("this is airtel constructor");
    }

/**
 * simslot ()
 */
    @Override
    public void simslot() {
        System.out.println("here i inserted airtel sim");
    }
}
