package com.san.singtel.assignment.util;

import com.san.singtel.assignment.behaviour.fly.CanFly;
import com.san.singtel.assignment.behaviour.sing.CanSing;
import com.san.singtel.assignment.behaviour.swim.CanSwim;
import com.san.singtel.assignment.behaviour.walk.CanWalk;
import com.san.singtel.assignment.model.LivingThing;

import java.util.List;
import java.util.Optional;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class CountAnimals {

    public int walkableCount(List<LivingThing> livingThings) {
        int count = 0;
        if (Optional.ofNullable(livingThings).map(List::size).orElse(0) == 0) {
            return count;
        }

        for (LivingThing livingThing : livingThings) {
            if (livingThing.getWalkable() != null && livingThing.getWalkable() instanceof CanWalk) {
                count++;
            }
        }
        return count;
    }

    public int flyableCount(List<LivingThing> livingThings) {
        int count = 0;
        for (LivingThing livingThing : livingThings) {
            if (livingThing.getFlyable() != null
                    && livingThing.getFlyable() instanceof CanFly) {
                count++;
            }
        }
        return count;
    }

    public int singableCount(List<LivingThing> livingThings) {
        int count = 0;
        for (LivingThing livingThing : livingThings) {
            if (livingThing.getSingable() != null
                    && livingThing.getSingable() instanceof CanSing) {
                count++;
            }
        }
        return count;
    }

    public int swimmableCount(List<LivingThing> livingThings) {
        int count = 0;
        for (LivingThing livingThing : livingThings) {
            if (livingThing.getSwimmable() != null
                    && livingThing.getSwimmable() instanceof CanSwim) {
                count++;
            }
        }
        return count;
    }
}
