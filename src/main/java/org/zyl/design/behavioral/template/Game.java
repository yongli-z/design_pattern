package org.zyl.design.behavioral.template;

public abstract class Game {
    public abstract void init();

    public abstract void instance();

    public abstract void stop();

    public final void play(){
        init();

        instance();

        stop();
    }

}
