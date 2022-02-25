package Jcore_HW1;

import Jcore_HW1.Action.ActionState;
import Jcore_HW1.Action.PlayerAction;
import Jcore_HW1.Obstacle.Obstacle;

public class Player {
    private final String name;
    private final PlayerAction[] playerActions;

    public Player(String name, PlayerAction[] playerActions) {
        this.name = name;
        this.playerActions = playerActions;
    }
    public String getName() {
        return name;
    }

    public void tryPass(Obstacle obstacle) {
        System.out.println(getName() + " пытается преодолеть " + obstacle.getObstacleName());
        for(PlayerAction action : playerActions) {
            action.pass(obstacle);
        }
    }

    public boolean win(){
        for (PlayerAction action : playerActions) {
            if (action.getActionState() == ActionState.NONE || action.getActionState() == ActionState.DEFEAT) {
                return false;
            }
        }
        return true;
    }
}
