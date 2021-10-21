package org;
import org.junit.Before;
import org.junit.Test;
import org.zyl.design.behavioral.chainOfResponsibility.*;

public class ChainDemo {
    @Test
    public void text(){
        AbstractLogger log = ChainLogger.getChainLogger();
        log.logMessage(3,"my is 2");
        //log.logMessage(2,"my is 2");
        //log.logMessage(3,"my is 3");
    }

}
