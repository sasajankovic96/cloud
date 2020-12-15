package com.sasajankovic.clouddemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "counter")
public class Counter {

    @GeneratedValue
    @Id
    private Long id;

    public Counter() {}

    public Counter(Long id, int counter) {
        this.id = id;
        this.counter = counter;
    }

    private int counter;

    public Counter incrementCounter() {
        return new Counter(id, ++counter);
    }

    public int getCounter() {
        return counter;
    }
}
