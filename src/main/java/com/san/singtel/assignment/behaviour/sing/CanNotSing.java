package com.san.singtel.assignment.behaviour.sing;

import com.san.singtel.assignment.behaviour.Singable;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class CanNotSing implements Singable {

    @Override
    public void sing() {
        System.out.println("Can not sing");
    }
}
