package Jcore_HW1.Action;

import Jcore_HW1.Obstacle.Obstacle;
import Jcore_HW1.Obstacle.Pool;

public class SwimAction implements PlayerAction {
    private int maxDistance;
    private ActionState actionState;

    public SwimAction (int maxDistance) {
        this.maxDistance = maxDistance;
        actionState = ActionState.NONE;
    }

    @Override
    public void pass(Obstacle obstacle) {
        if(obstacle instanceof Pool) {
            Pool pool = (Pool) obstacle;
            if (pool.getDistance() <= maxDistance) {
                System.out.println("Игрок проплыл.");
                actionState = ActionState.VICTORY;
            } else {
                System.out.println("Игрок не смог проплыть. Если бы ласты, то смогбы проплыть: " + maxDistance);
                actionState = ActionState.DEFEAT;
            }
        }
    }

    @Override
    public ActionState getActionState() {
        return actionState;
    }
}
