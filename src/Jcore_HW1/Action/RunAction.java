package Jcore_HW1.Action;

import Jcore_HW1.Obstacle.Obstacle;
import Jcore_HW1.Obstacle.Racetrack;

public class RunAction implements  PlayerAction{
    private int maxDistance;
    private ActionState actionState;

    public RunAction (int maxDistance) {
        this.maxDistance = maxDistance;
        actionState = ActionState.NONE;
    }

    @Override
    public void pass(Obstacle obstacle) {
        if (obstacle instanceof Racetrack) {
            Racetrack racetrack = (Racetrack) obstacle;
            if(racetrack.getDistance() <= maxDistance) {
                System.out.println("Игрок пробежал.");
                actionState = ActionState.VICTORY;
            } else {
                System.out.println("Игрок не смог пробежать, далеко. Вот " + maxDistance + " пробежал бы.");
                actionState = ActionState.DEFEAT;
            }
        }
    }

    @Override
    public ActionState getActionState() {
        return actionState;
    }
}
