package com.changmin.domain;

import java.io.Serializable;

/**
 * @Author:pcm5566
 * @Date:2018/12/5
 */
public class Product implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private float price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}