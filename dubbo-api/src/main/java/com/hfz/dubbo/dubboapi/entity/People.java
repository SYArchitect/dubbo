package com.hfz.dubbo.dubboapi.entity;

import java.io.Serializable;

/**
 * @author HFZ
 */
public class People implements Serializable {

    private static final long serialVersionUID = 1415852192397895853L;

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
