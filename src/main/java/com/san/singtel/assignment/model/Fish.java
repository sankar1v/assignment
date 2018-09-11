package com.san.singtel.assignment.model;

import com.san.singtel.assignment.behaviour.sing.CanNotSing;
import com.san.singtel.assignment.behaviour.swim.CanSwim;
import com.san.singtel.assignment.behaviour.walk.CanNotWalk;
import com.san.singtel.assignment.util.Color;
import com.san.singtel.assignment.util.Size;
import lombok.Data;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
@Data
public class Fish  extends LivingThing {

    protected Size size;
    protected Color color;

    public Fish(){
        this.swimmable=new CanSwim();
        this.walkable =new CanNotWalk();
        this.singable= new CanNotSing();
    }

    public Size size() {
        return size;
    }

    public Color color() {
        return color;
    }
}
