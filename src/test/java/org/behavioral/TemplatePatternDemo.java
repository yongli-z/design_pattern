package org.behavioral;

import org.junit.Test;
import org.zyl.design.behavioral.template.BallGame;

public class TemplatePatternDemo {
    @Test
    public void test(){
        BallGame ballgame = new BallGame();
        ballgame.play();
    }
}
