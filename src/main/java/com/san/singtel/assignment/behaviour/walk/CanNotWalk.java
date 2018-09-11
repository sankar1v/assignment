package com.san.singtel.assignment.behaviour.walk;

import com.san.singtel.assignment.behaviour.Walkable;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class CanNotWalk implements Walkable {

    @Override
    public void walk() {
        System.out.println("Can not walk");
    }
}
