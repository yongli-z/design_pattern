package org.zyl.design.behavioral.observer;


import lombok.extern.java.Log;

@Log
public class SecurityGuard implements Observer{
    public SecurityGuard(Criminal criminal) {
        criminal.addObserver(this);
    }
    @Override
    public void action() { log.info("My is"+SecurityGuard.class.getSimpleName()+ " pp ");
    }
}
