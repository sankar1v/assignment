package com.san.singtel.assignment.behaviour.walk;

import com.san.singtel.assignment.behaviour.Walkable;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
public class CrawlWalk implements Walkable {
    @Override
    public void walk() {
        System.out.println("I am crawling");
    }
}
