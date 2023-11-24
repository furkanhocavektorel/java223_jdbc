package org.vektorel.entity;

import org.vektorel.entity.enums.State;

public abstract class BaseEntity {
    private int id;
    private String createDate;
    private String updateDate;
    private State state;

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", createDate='" + createDate + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", state=" + state +
                '}';
    }

    public BaseEntity() {
    }

    public BaseEntity(int id, String createDate, String updateDate, State state) {
        this.id = id;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
