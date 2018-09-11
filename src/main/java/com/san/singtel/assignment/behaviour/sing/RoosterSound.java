package com.san.singtel.assignment.behaviour.sing;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class RoosterSound extends CanSing {

    @Override
    public void sing() {
        System.out.println(getSound("rooster"));
    }
}
