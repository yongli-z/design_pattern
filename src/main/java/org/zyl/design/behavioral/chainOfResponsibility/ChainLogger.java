package org.zyl.design.behavioral.chainOfResponsibility;

public  class ChainLogger {
    static ErrorLogger errorlogger ;
    static DebugLogger debuglogger;
    static InfoLogger infologger;

    public static AbstractLogger  getChainLogger(){
        ErrorLogger errorlogger = new ErrorLogger(AbstractLogger.ERROR);
        DebugLogger debuglogger = new DebugLogger(AbstractLogger.DEBUG);
        InfoLogger infologger = new InfoLogger(AbstractLogger.INFO);

        infologger.setNextLogger(debuglogger);
        debuglogger.setNextLogger(errorlogger);
        return infologger;
    }
}
