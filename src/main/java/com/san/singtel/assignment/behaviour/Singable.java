package com.san.singtel.assignment.behaviour;

import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
@FunctionalInterface
public interface Singable {

    void sing();

    default ResourceBundle getBundle() {
        Locale locale = Optional.ofNullable(Locale.getDefault()).orElse(Locale.ENGLISH);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("AppMsg", locale);
        return resourceBundle;
    }

    default String getSound(String livingthing) {
        StringBuffer sound = new StringBuffer(livingthing).append(".sound");
        return getBundle().getString(sound.toString());
    }
}
