package com.san.singtel.assignment.model;

import com.san.singtel.assignment.behaviour.fly.CanFly;
import com.san.singtel.assignment.behaviour.sing.CanSing;
import com.san.singtel.assignment.behaviour.walk.CanWalk;
import lombok.Data;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
@Data
public class Bird extends LivingThing {

    public Bird(){
        this.walkable=new CanWalk();
        this.flyable =new CanFly();
        this.singable=new CanSing();
    }
}