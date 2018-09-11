package com.san.singtel.assignment;

import com.san.singtel.assignment.model.Animal;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class AnimalTest extends BaseTest {

    @Test
    public void testWalk() {
        Animal animal = new Animal();
        animal.walk();
        assertThat(sysOut.asString(), containsString("I am walking"));
    }
}
