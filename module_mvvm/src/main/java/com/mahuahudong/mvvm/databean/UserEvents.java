package com.mahuahudong.mvvm.databean;

import java.io.Serializable;
import java.util.List;

public class UserEvents implements Serializable {
    private List<UserEventBean> events;

    public List<UserEventBean> getEvents() {
        return events;
    }

    public void setEvents(List<UserEventBean> events) {
        this.events = events;
    }
}
