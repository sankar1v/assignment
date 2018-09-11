package com.san.singtel.assignment;

import com.san.singtel.assignment.model.fish.Clownfish;
import com.san.singtel.assignment.util.Color;
import com.san.singtel.assignment.util.Size;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class ClownfishTest extends BaseTest {

    Clownfish clownfish;

    @Before
    public void setUp() {
        this.clownfish = new Clownfish();
    }

    @Test
    public void should_Not_Walk_When_Call_Walk() {
        clownfish.walk();
        assertThat(sysOut.asString(), containsString("Can not walk"));
    }

    @Test
    public void should_Not_Sing_When_Call_Sing() {
        clownfish.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }

    @Test
    public void should_Swim_When_Call_Swim() {
        clownfish.swim();
        assertThat(sysOut.asString(), containsString("I am swimming"));
    }

    @Test
    public void should_Return_Small_When_Call_Size() {
        Size size = clownfish.size();
        assertEquals(Size.SMALL, size);
    }

    @Test
    public void should_Return_Orange_When_Call_Color() {
        Color color = clownfish.color();
        assertEquals(Color.ORANGE, color);
    }
}
