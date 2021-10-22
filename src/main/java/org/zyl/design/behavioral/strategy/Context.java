package org.zyl.design.behavioral.strategy;

public class Context {
    Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int complit(int i, int j){
        return strategy.doOperation(i,j);
    }
}
