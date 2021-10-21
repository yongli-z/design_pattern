package org.zyl.design.behavioral.observer;


import lombok.extern.java.Log;

@Log
public class Police implements Observer{
    public Police(Criminal criminal) {
        criminal.addObserver(this);
    }
    @Override
    public void action() {
        log.info("My is"+Police.class.getSimpleName()+ " rawd ");
    }
}
