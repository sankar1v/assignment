package com.san.singtel.assignment.util;

import com.san.singtel.assignment.behaviour.Flyable;
import com.san.singtel.assignment.behaviour.Singable;
import com.san.singtel.assignment.behaviour.Swimmable;
import com.san.singtel.assignment.behaviour.Walkable;
import com.san.singtel.assignment.behaviour.fly.CanFly;
import com.san.singtel.assignment.behaviour.sing.CanSing;
import com.san.singtel.assignment.behaviour.swim.CanSwim;
import com.san.singtel.assignment.behaviour.walk.CanWalk;
import com.san.singtel.assignment.model.LivingThing;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class CountAnimals {

    public long walkableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Walkable> livingThingToWalkable = LivingThing::getWalkable;
        return getCount(livingThings, livingThingToWalkable, walkable -> walkable instanceof CanWalk);
    }

    public long flyableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Flyable> livingThingToFlyable = LivingThing::getFlyable;
        return getCount(livingThings, livingThingToFlyable, flyable -> flyable instanceof CanFly);
    }

    public long singableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Singable> livingThingToSingable = LivingThing::getSingable;
        return getCount(livingThings, livingThingToSingable, singable -> singable instanceof CanSing);
    }

    public long swimmableCount(List<LivingThing> livingThings) {
        Function<LivingThing, Swimmable> livingThingToSwimmable = LivingThing::getSwimmable;
        return getCount(livingThings, livingThingToSwimmable, swimmable -> swimmable instanceof CanSwim);
    }

    private long getCount(List<LivingThing> livingThings, Function function, Predicate predicate) {
        return Optional.ofNullable(livingThings).map(Collection::parallelStream).orElseGet(Stream::empty)
                .map(function)
                .filter(predicate)
                .count();
    }

}
