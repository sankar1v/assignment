package com.san.singtel.assignment.model.bird;

import com.san.singtel.assignment.behaviour.sing.DuckSound;
import com.san.singtel.assignment.behaviour.swim.CanSwim;
import com.san.singtel.assignment.model.Bird;
import lombok.Data;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
@Data
public class Duck extends Bird {

    public Duck(){
        this.singable =new DuckSound();
        this.swimmable= new CanSwim();
    }
}
