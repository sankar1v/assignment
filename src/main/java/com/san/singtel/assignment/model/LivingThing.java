package com.san.singtel.assignment.model;

import com.san.singtel.assignment.behaviour.Flyable;
import com.san.singtel.assignment.behaviour.Singable;
import com.san.singtel.assignment.behaviour.Swimmable;
import com.san.singtel.assignment.behaviour.Walkable;
import lombok.Data;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
@Data
public abstract class LivingThing {

    protected Walkable walkable;
    protected Flyable flyable;
    protected Singable singable;
    protected Swimmable swimmable;

    public void walk(){
        this.walkable.walk();
    }

    public void fly() {
        this.flyable.fly();
    }

    public void sing() {
        this.singable.sing();
    }

    public void swim() {
        this.swimmable.swim();
    }
}
