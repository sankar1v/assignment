package com.san.singtel.assignment.model.bird;

import com.san.singtel.assignment.behaviour.fly.CanNotFly;
import com.san.singtel.assignment.behaviour.sing.ChickenSound;
import com.san.singtel.assignment.model.Bird;
import lombok.Data;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
@Data
public class Chicken extends Bird {

    public  Chicken(){
        this.singable=new ChickenSound();
        this.flyable =new CanNotFly();
    }
}
