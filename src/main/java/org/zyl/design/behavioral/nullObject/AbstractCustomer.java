package org.zyl.design.behavioral.nullObject;

import lombok.Data;


public abstract class AbstractCustomer {
    public String name;

    public abstract boolean isNull();

    public abstract String getName();
}
