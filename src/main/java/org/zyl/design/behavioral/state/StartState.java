package org.zyl.design.behavioral.state;

import lombok.extern.java.Log;

@Log
public class StartState implements State{
    @Override
    public void setState(Context context) {
        context.setState(this);
    }

    public void doSomting(){
        log.info("My is " + this.getClass().getSimpleName());
    }
}
