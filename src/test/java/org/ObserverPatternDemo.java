package org;

import lombok.extern.java.Log;
import org.junit.Test;
import org.zyl.design.behavioral.observer.*;

@Log
public class ObserverPatternDemo {

    @Test
    public void test(){
        Criminal sg = new Criminal();
        Observer ob1 = new Police(sg);
        Observer ob2 = new SecurityGuard(sg);
        Observer ob3 = new Soder(sg);

        sg.jup();
        log.info("________________________");
        sg.paly();
        log.info("________________________");
        sg.song();
    }

}
