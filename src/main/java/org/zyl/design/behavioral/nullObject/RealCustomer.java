package org.zyl.design.behavioral.nullObject;

public class RealCustomer extends  AbstractCustomer{


    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }


    public RealCustomer(String name) {
        this.name = name;
    }


}
