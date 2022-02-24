package Jcore_HW1.Action;

import Jcore_HW1.Obstacle.Obstacle;

public interface PlayerAction {
    void pass(Obstacle obstacle);
    ActionState getActionState();
}
