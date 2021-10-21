package org.zyl.design.behavioral.chainOfResponsibility;

import lombok.extern.java.Log;

@Log
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level) {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        log.info("ErrorLogger ...write "+message);
    }
}
