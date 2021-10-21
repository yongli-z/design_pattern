package org.zyl.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Criminal {



    private List<Observer> list = new ArrayList<>();

    private void notifyOb (){
        for (Observer observer : list) {
            observer.action();
        }
    }

    public void addObserver(Observer ob){
        list.add(ob);
    }

    public void paly(){
        notifyOb();
    }

    public void jup(){
        notifyOb();
    }

    public void song(){
        notifyOb();
    }

}
