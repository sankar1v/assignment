package com.san.singtel.assignment;

import com.san.singtel.assignment.model.bird.Duck;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class DuckTest {

    @Rule
    public SystemOutRes sysOut = new SystemOutRes();
    Duck duck;

    @Before
    public void setUp() {
        this.duck = new Duck();
    }

    @Test
    public void should_Say_Quack_quack_When_Call_Sing() {
        duck.sing();
        assertThat(sysOut.asString(), containsString("Quack, quack"));
    }

    @Test
    public void should_Swim_When_Call_Swim() {
        duck.swim();
        assertThat(sysOut.asString(), containsString("I am swimming"));
    }
}