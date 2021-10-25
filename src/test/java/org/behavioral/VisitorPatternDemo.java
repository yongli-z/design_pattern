package org.behavioral;

import org.junit.Test;
import org.zyl.design.behavioral.visitor.Computer;
import org.zyl.design.behavioral.visitor.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
    @Test
    public void test(){
        ComputerPartDisplayVisitor computerpartdisplayvisitor = new ComputerPartDisplayVisitor();
        Computer computer = new Computer();
        computer.accept(computerpartdisplayvisitor);
    }
}
