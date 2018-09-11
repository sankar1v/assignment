package com.san.singtel.assignment;

import com.san.singtel.assignment.model.bird.Chicken;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class ChickenTest extends BaseTest {

    Chicken chicken;

    @Before
    public void setUp() {
        this.chicken = new Chicken();
    }

    @Test
    public void can_Not_Fly_When_Call_Fly() {
        chicken.fly();
        assertThat(sysOut.asString(), containsString("Can not fly"));
    }

    @Test
    public void should_Say_Cluck_cluck_When_Call_Sing() {
        chicken.sing();
        assertThat(sysOut.asString(), containsString("Cluck, cluck"));
    }
}
