package org.behavioral;


import lombok.extern.java.Log;
import org.junit.Test;
import org.zyl.design.behavioral.nullObject.AbstractCustomer;
import org.zyl.design.behavioral.nullObject.CustomerFactory;

@Log
public class NullObjectPatternDemo {

    @Test
    public void test(){
        AbstractCustomer tealCustomer = CustomerFactory.getCustomer( "Rob");
        log.info(tealCustomer.getName());
        AbstractCustomer tealCustomer1 = CustomerFactory.getCustomer("haha");
        log.info(tealCustomer1.getName());
        log.info("------------------------------------------------------end");
    }
}
