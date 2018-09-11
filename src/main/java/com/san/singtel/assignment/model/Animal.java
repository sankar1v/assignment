package com.san.singtel.assignment.model;

import com.san.singtel.assignment.behaviour.walk.CanWalk;
import lombok.Data;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
@Data
public class Animal extends LivingThing {

    public Animal() {
        this.walkable = new CanWalk();
    }
}
