package Jcore_HW1;

import Jcore_HW1.Action.JumpAction;
import Jcore_HW1.Action.PlayerAction;
import Jcore_HW1.Action.RunAction;
import Jcore_HW1.Action.SwimAction;
import Jcore_HW1.Obstacle.Obstacle;
import Jcore_HW1.Obstacle.Pool;
import Jcore_HW1.Obstacle.Racetrack;
import Jcore_HW1.Obstacle.Wall;

import java.util.Random;

public class Main {
    private static final int POOL_DIST = 75;
    private static final int RUN_DIST = 150;
    private static final int JUMP_HEIGHT = 2;

    public static void main(String[] args) {
        Course course = new Course(makeObstacles());
        Player[] players = makePlayers();
        Team team = new Team ("GeekBrains", players);
        course.doIt(team);
        team.printWinners();
    }

    public static Obstacle[] makeObstacles() {
        return new Obstacle[] {
                new Pool(POOL_DIST),
                new Racetrack(RUN_DIST),
                new Wall(JUMP_HEIGHT),
        };
    }

    public static Player[] makePlayers() {
      return new Player[] {
              new Player("Pavel", new PlayerAction[]{getRunAction()}),
              new Player("Elena", new PlayerAction[]{getJumpAction(), getSwimAction()}),
              new Player("Anastasia", new PlayerAction[]{getSwimAction(), getRunAction()}),
              new Player("Ivan", new PlayerAction[]{getJumpAction(),getRunAction(),getSwimAction()}),
      };
    }

    public static PlayerAction getSwimAction() {
        Random random = new Random();
        SwimAction swimAction = new SwimAction(random.nextInt(POOL_DIST + 25));
        return swimAction;
    }
    public static PlayerAction getJumpAction() {
        Random random = new Random();
        JumpAction jumpAction = new JumpAction(random.nextInt(JUMP_HEIGHT + 1));
        return jumpAction;
    }
    public static PlayerAction getRunAction() {
        Random random = new Random();
        RunAction runAction = new RunAction(random.nextInt(RUN_DIST + 100));
        return runAction;
    }
}
