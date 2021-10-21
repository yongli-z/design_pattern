package org.zyl.design.behavioral.chainOfResponsibility;

import lombok.extern.java.Log;

@Log
public class DebugLogger extends AbstractLogger{

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        log.info("DebugLogger ...write "+message);
    }
}
