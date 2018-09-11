package com.san.singtel.assignment.model.fish;

import com.san.singtel.assignment.behaviour.swim.GreatSwimmers;
import com.san.singtel.assignment.model.Fish;
import com.san.singtel.assignment.model.LivingThing;
import lombok.Data;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
@Data
public class Dolphin extends LivingThing {

    Fish fish;

    public Dolphin(){
        this.swimmable= new GreatSwimmers();
        this.fish =new Fish();
        this.walkable = this.fish.getWalkable();
        this.singable = this.fish.getSingable();
    }

}
