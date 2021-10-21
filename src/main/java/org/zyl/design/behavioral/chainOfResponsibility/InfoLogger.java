package org.zyl.design.behavioral.chainOfResponsibility;

import lombok.extern.java.Log;

@Log
public class InfoLogger extends AbstractLogger{

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        log.info("InfoLogger ...write "+message);
    }
}
