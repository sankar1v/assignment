package com.san.singtel.assignment.model.animal;

import com.san.singtel.assignment.behaviour.fly.CanFly;
import com.san.singtel.assignment.behaviour.sing.CanNotSing;
import lombok.Data;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
@Data
public class Butterfly extends Caterpillar {

    public Butterfly(){
        this.flyable =new CanFly();
        this.singable= new CanNotSing();
    }
}
