package com.cachexic.springboot.system.entity;

/**
 * Created by tangm on 2017/4/4.
 */
public class Role {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
