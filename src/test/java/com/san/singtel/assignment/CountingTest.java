package com.san.singtel.assignment;

import com.san.singtel.assignment.model.Bird;
import com.san.singtel.assignment.model.Fish;
import com.san.singtel.assignment.model.LivingThing;
import com.san.singtel.assignment.model.animal.Butterfly;
import com.san.singtel.assignment.model.animal.Cat;
import com.san.singtel.assignment.model.animal.Dog;
import com.san.singtel.assignment.model.animal.Frog;
import com.san.singtel.assignment.model.bird.Chicken;
import com.san.singtel.assignment.model.bird.Duck;
import com.san.singtel.assignment.model.bird.Parrot;
import com.san.singtel.assignment.model.bird.Rooster;
import com.san.singtel.assignment.model.fish.Clownfish;
import com.san.singtel.assignment.model.fish.Dolphin;
import com.san.singtel.assignment.model.fish.Shark;
import com.san.singtel.assignment.util.CountAnimals;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class CountingTest extends BaseTest {

    CountAnimals countAnimals;
    List<LivingThing> livingThings;

    @Before
    public void setUp() {
        this.countAnimals = new CountAnimals();
        livingThings = Arrays.asList(
                new Bird(),  //  Sing, Fly ,Walk
                new Duck(),  //  Sing, Fly ,Walk, Swim
                new Chicken(), // Sing, Fly ,Walk
                new Rooster(), // Sing, Fly ,Walk
                new Parrot(), //Sing, Fly ,Walk
                new Fish(), // Swim
                new Shark(), // Swim
                new Clownfish(), // Swim
                new Dolphin(), // Swim
                new Frog(), // Sing, Walk
                new Dog(), // Sing, Walk
                new Butterfly(), // Fly, Walk
                new Cat());  // Sing, Walk
    }

    @Test
    public void should_Verify_WalkableCount() {
        long count = this.countAnimals.walkableCount(livingThings);
        assertEquals(8, count);
    }

    @Test
    public void should_Verify_FlyableCount() {
        long count = this.countAnimals.flyableCount(livingThings);
        assertEquals(5, count);
    }

    @Test
    public void should_Verify_SingableCount() {
        long count = this.countAnimals.singableCount(livingThings);
        assertEquals(8, count);
    }

    @Test
    public void should_Verify_SwimmableCount() {
        long count = this.countAnimals.swimmableCount(livingThings);
        assertEquals(5, count);
    }
}
