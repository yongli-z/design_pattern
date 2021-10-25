package org.behavioral;

import org.zyl.design.behavioral.state.Context;
import org.zyl.design.behavioral.state.StartState;
import org.zyl.design.behavioral.state.State;
import org.zyl.design.behavioral.state.StopState;

public class StatePatternDemo {


    public static void main(String[] args) {
        StartState startState = new StartState();
        StopState stopState = new StopState();
        Context context = new Context();
        startState.setState(context);
        startState.doSomting();
        stopState.setState(context);
        stopState.doSomting();
    }
}
