package Jcore_HW1.Action;

import Jcore_HW1.Obstacle.Obstacle;
import Jcore_HW1.Obstacle.Wall;

public class JumpAction implements PlayerAction {
    private int maxDistance;
    private  ActionState actionState;

    public JumpAction(int maxDistance) {
        this.maxDistance = maxDistance;
        actionState = ActionState.NONE;
    }

    @Override
    public void pass (Obstacle obstacle) {
        if(obstacle instanceof Wall) {
            Wall wall = (Wall) obstacle;
            if (wall.getDistance() <= maxDistance) {
                System.out.println("Игрок прыгнул");
                actionState = ActionState.VICTORY;
            } else {
                System.out.println("Игрок говорит, что слишком высоко. Вот на " + maxDistance + " я смогу.");
                actionState = ActionState.DEFEAT;
            }
        }
    }

    @Override
    public ActionState getActionState() {
        return actionState;
    }
}
