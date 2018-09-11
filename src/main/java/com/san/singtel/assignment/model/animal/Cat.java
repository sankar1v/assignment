package com.san.singtel.assignment.model.animal;

import com.san.singtel.assignment.behaviour.sing.CatSound;
import com.san.singtel.assignment.model.Animal;
import lombok.Data;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
@Data
public class Cat extends Animal {

    public Cat(){
        this.singable= new CatSound();
    }
}
