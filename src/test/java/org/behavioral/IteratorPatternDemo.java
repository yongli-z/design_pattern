package org.behavioral;

import org.zyl.design.behavioral.iterator.Iterator;
import org.zyl.design.behavioral.iterator.NameRepository;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
