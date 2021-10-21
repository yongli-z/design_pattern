package org.zyl.design.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> listMe = new ArrayList<Memento>();

    public void add(Memento me){
        listMe.add(me);
    }

    public Memento get(int i){
        return listMe.get(i);
    }
}
