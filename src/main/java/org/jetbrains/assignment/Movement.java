package org.jetbrains.assignment;

import java.util.*;

public class Movement {
    public List<Coordinates> getMovementList() {
        return movementList;
    }

    public void setMovementList(List<Coordinates> movementList) {
        this.movementList = movementList;
    }

    private List<Coordinates> movementList;

    public Movement() {
        movementList = new ArrayList<>();
        movementList.add(new Coordinates(0, 0));
    }

    public String getAsJSON()
    {
        String ret = new String();
        for (int i = 0; i<movementList.size(); i++)
        {
            ret.concat(movementList.get(i).getAsJSON())
        }
    }

}
