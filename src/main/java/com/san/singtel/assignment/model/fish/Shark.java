package com.san.singtel.assignment.model.fish;

import com.san.singtel.assignment.model.Fish;
import com.san.singtel.assignment.util.Color;
import com.san.singtel.assignment.util.Size;
import lombok.Data;

/**
 * Created by sankarvinnakota on 11/09/18.
 */
@Data
public class Shark  extends Fish {

    public  Shark(){
        this.size= Size.LARGE;
        this.color=Color.GREY;
    }
}
