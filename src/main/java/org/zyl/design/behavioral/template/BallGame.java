package org.zyl.design.behavioral.template;

import lombok.extern.java.Log;

@Log
public class BallGame extends Game {
    @Override
    public void init() {
        log.info("my is init ...... ");
    }

    @Override
    public void instance() {
        log.info("my is instance ...... ");
    }

    @Override
    public void stop() {
        log.info("my is stop ...... ");
    }
}
