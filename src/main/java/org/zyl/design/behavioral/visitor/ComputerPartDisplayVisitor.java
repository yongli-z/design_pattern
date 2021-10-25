package org.zyl.design.behavioral.visitor;

import lombok.extern.java.Log;

@Log
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        log.info("my is  Computer ......");
    }

    @Override
    public void visit(Mouse mouse) {
        log.info("my is  Mouse ......");
    }

    @Override
    public void visit(Keyboard keyboard) {
        log.info("my is  Keyboard ......");
    }

    @Override
    public void visit(Monitor monitor) {
        log.info("my is  Monitor ......");
    }
}
