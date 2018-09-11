package com.san.singtel.assignment.behaviour.fly;

import com.san.singtel.assignment.behaviour.Flyable;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class CanNotFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
}
