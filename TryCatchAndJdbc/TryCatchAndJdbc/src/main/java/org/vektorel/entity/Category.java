package org.vektorel.entity;

import org.vektorel.entity.enums.State;

// pojo -> entity
public class Category extends BaseEntity {

    private String name;

    private int id;
    private String createDate;
    private String updateDate;
    private State state;


    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                ", name='" + name + '\'' +
                '}'+super.toString();
    }
}
