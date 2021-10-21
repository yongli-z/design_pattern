package org.zyl.design.behavioral.memento;

import lombok.Data;

@Data
public class Originator {
    private String state;

    public Memento saveStateToMemento(){
        Memento me = new Memento();
        me.setState(this.state);
        return  me;
    }

    public String  getStateFromMemento(Memento me){
        return state = me.getState();
    }
}
