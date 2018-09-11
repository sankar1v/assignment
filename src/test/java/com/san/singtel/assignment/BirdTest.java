package com.san.singtel.assignment;

import com.san.singtel.assignment.model.Bird;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class BirdTest {

    @Rule
    public SystemOutRes sysOut = new SystemOutRes();
    Bird bird;

    @Before
    public void setUp() {
        this.bird = new Bird();
    }

    @Test
    public void should_Walk_When_Call_Walk() {
        bird.walk();
        assertThat(sysOut.asString(), containsString("I am walking"));
    }

    @Test
    public void should_Fly_When_Call_Fly() {
        bird.fly();
        assertThat(sysOut.asString(), containsString("I am flying"));
    }

    @Test
    public void should_Sing_When_Call_Sing() {
        bird.sing();
        assertThat(sysOut.asString(), containsString("I am singing"));
    }

}
