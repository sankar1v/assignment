package com.san.singtel.assignment.model.animal;

import com.san.singtel.assignment.behaviour.sing.CanSing;
import com.san.singtel.assignment.model.Animal;
import lombok.Data;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
@Data
public class Frog extends Animal {

    public Frog(){
        this.singable =new CanSing();
    }

}
