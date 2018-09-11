package com.san.singtel.assignment.model.animal;

import com.san.singtel.assignment.behaviour.fly.CanNotFly;
import com.san.singtel.assignment.behaviour.walk.CrawlWalk;
import com.san.singtel.assignment.model.Animal;
import lombok.Data;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
@Data
public class Caterpillar extends Animal {

    public Caterpillar(){
        this.flyable= new CanNotFly();
        this.walkable= new CrawlWalk();
    }
}
