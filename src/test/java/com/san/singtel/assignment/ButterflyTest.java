package com.san.singtel.assignment;

import com.san.singtel.assignment.model.animal.Butterfly;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class ButterflyTest extends BaseTest {

    Butterfly butterfly;
    @Before
    public void setUp(){
        this.butterfly=new Butterfly();
    }

    @Test
    public void should_Fly_When_Call_Fly() {
        butterfly.fly();
        assertThat(sysOut.asString(), containsString("I am flying"));
    }

    @Test
    public void should_Not_Sing_When_Call_Sing() {
        butterfly.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }
}
