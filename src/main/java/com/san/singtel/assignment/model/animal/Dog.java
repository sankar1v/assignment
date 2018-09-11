package com.san.singtel.assignment.model.animal;

import com.san.singtel.assignment.behaviour.sing.DogSound;
import com.san.singtel.assignment.model.Animal;
import lombok.Data;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
@Data
public class Dog extends Animal {

    public Dog(){
        this.singable = new DogSound();
    }
}
