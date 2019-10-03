package com.example.tourmatebase03;

import java.io.Serializable;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Event  implements Serializable {


    private String id;
    private String name;
    private String destination;
    private int budget;


    public Event(String id, String name, String destination, int budget) {
        this.id = id;
        this.name = name;
        this.destination = destination;
        this.budget = budget;
    }

    public Event() {
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDestination() {
        return destination;
    }

    public int getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", budget=" + budget +
                '}';
    }
}


