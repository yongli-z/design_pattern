package org.zyl.design.behavioral.observer;


import lombok.extern.java.Log;

@Log
public class Soder implements Observer{

    public Soder(Criminal criminal) {
        criminal.addObserver(this);
    }

    @Override
    public void action() {
        log.info("My is"+Observer.class.getSimpleName()+ " pp ");
    }
}
