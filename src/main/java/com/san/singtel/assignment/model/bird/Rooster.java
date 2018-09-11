package com.san.singtel.assignment.model.bird;

import com.san.singtel.assignment.behaviour.sing.RoosterSound;
import com.san.singtel.assignment.model.Bird;
import lombok.Data;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
@Data
public class Rooster extends Bird {

    Chicken chicken;

    public Rooster(){
        this.singable= new RoosterSound();
        this.chicken=new Chicken();
    }

    @Override
    public void fly(){
        this.chicken.fly();
    }
}
