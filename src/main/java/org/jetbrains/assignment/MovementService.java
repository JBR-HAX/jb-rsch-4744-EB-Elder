package org.jetbrains.assignment;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class MovementService {

    private Movement movement = new Movement();

    public void add(Direction direction)
    {
        Coordinates newCoordinate = movement.getMovementList().get(movement.getMovementList().size() - 1);

        String cardinalPoint = direction.getDirection();
        int steps = direction.getSteps();
        if(Objects.equals(cardinalPoint, "NORTH"))
        {
            newCoordinate.setY(newCoordinate.getY() + steps);
        } else if (Objects.equals(cardinalPoint, "SOUTH")) {
            newCoordinate.setY(newCoordinate.getY() - steps);
        } else if (Objects.equals(cardinalPoint, "EAST")) {
            newCoordinate.setX(newCoordinate.getX() + steps);
        } else {
            newCoordinate.setX(newCoordinate.getX() - steps);
        }
        movement.getMovementList().add(newCoordinate);
    }

}
