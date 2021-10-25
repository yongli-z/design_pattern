package org.behavioral;

import lombok.extern.java.Log;
import org.junit.Test;
import org.zyl.design.behavioral.strategy.Context;
import org.zyl.design.behavioral.strategy.OperationAdd;
import org.zyl.design.behavioral.strategy.OperationMultiply;
import org.zyl.design.behavioral.strategy.OperationSubtract;

@Log
public class StrategyPatternDemo {
    @Test
    public void test(){

        Context context = new Context();
        context.setStrategy(new OperationAdd());
        log.info(context.complit(2,3)+"");

        context.setStrategy(new OperationMultiply());
        log.info(context.complit(2,3)+"");

        context.setStrategy(new OperationSubtract());
        log.info(context.complit(2,3)+"");
    }
}
