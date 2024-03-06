package org.jetbrains.assignment;

import java.util.List;

public class InputData {
    private final int id;
    private List<Direction> directions;

    public InputData(int id, List<Direction> NewDirections) {
        this.id = id;
        this.directions = NewDirections;
    }
}
