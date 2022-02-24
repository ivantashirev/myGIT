package Jcore_HW1;

import Jcore_HW1.Obstacle.Obstacle;

public class Team {

    private final String title;
    private final Player[] players;

    public Team(String title, Player[] players) {
        this.title = title;
        this.players = players;
    }

    public void printAllPlayers() {
        System.out.println("Состав команды: ");
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }

    public void printWinners() {
        for (Player player : players) {
            if (player.win()) {
                System.out.println("Преодолел дистанцию " + title + ": " + player.getName());
            }
        }
    }

    public void overcomeObstacle (Obstacle obstacle) {
        for (Player player : players) {
            player.tryPass(obstacle);
        }
    }
}
