package com.san.singtel.assignment.behaviour.swim;

import com.san.singtel.assignment.behaviour.Swimmable;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class CanSwim implements Swimmable {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
