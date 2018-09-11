package com.san.singtel.assignment;


import org.junit.rules.ExternalResource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class SystemOutRes extends ExternalResource {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Override
    protected void before() {
        System.setOut(new PrintStream(outContent));
    }

    @Override
    protected void after() {
        System.setOut(System.out);
    }

    public String asString() {
        return outContent.toString();
    }
}
