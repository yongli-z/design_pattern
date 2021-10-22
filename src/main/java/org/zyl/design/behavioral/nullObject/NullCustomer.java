package org.zyl.design.behavioral.nullObject;

public class NullCustomer extends AbstractCustomer{

    public NullCustomer() {
        this.name =  "my is NullCustomer ";
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return this.name ;
    }
}
