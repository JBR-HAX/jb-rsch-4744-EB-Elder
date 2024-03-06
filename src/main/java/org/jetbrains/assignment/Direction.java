package org.jetbrains.assignment;

import java.util.List;
import java.util.Objects;

public class Direction {

    private String direction;
    private int steps;


    public Direction(String newDirection, int newSteps) {
        this.direction = newDirection;
        this.steps = newSteps;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }


}
