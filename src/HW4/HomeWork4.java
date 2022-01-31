package HW4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    public static char[][] gamefield;
    public static int fieldW;
    public static int fieldH;
    public static char player1 = 'X';
    public static char player2 = 'O';
    public static char empty = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        createGameField();
        showGameField();

        while(true) {
            stepPlayer1();
            showGameField();

            if (checkWinLine(player1)) {
                System.out.println(player1 + " Победа!");
                break;
            }

            if (checkFullField()) {
                System.out.println("Упс, не в этот раз :( ");
                break;
            }

            stepPlayer2();
            showGameField();

            if (checkWinLine(player2)) {
                System.out.println(player2 + " Победа!");
                break;
            }

            if (checkFullField()) {
                System.out.println("Упс, не в этот раз :( ");
                break;
            }
        }
        System.out.println("Game over!");
    }

    public static void createGameField() {
        fieldW = inputUserValue("Задайте размеы поля");
        fieldH = fieldW;
        gamefield = new char[fieldH][fieldW];

        for (int y = 0; y < fieldH; y++) {
            for (int x = 0; x < fieldW; x++) {
                gamefield[y][x] = empty;
            }
        }
    }

    public static void showGameField() {
        for (int y = 0; y < fieldH; y++) {
            for (int x = 0; x < fieldW; x++) {
                System.out.print(gamefield[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("----------");
    }

    public static void stepPlayer1() {

        int x;
        int y;
        do {
            x = inputUserValue("Ваше значение по горизонтали") - 1;
            y = inputUserValue("Ваше значение по вертикали") - 1;
        } while (!checkStepPlayer(y, x) || !checkCellFree(y, x));
        gamefield[y][x] = player1;
    }

    public static void stepPlayer2() {
        int x;
        int y;

        do {
            x = random.nextInt(fieldW);
            y = random.nextInt(fieldH);
        } while (!checkCellFree(y, x));
        gamefield[y][x] = player2;
    }

    public static boolean checkCellFree(int y, int x) {
        return gamefield[y][x] == empty;
    }

    public static boolean checkStepPlayer(int y, int x) {
        return x >= 0 && x < fieldW && y >= 0 && y < fieldH;
    }

    public static int inputUserValue(String systemMsg) {
        System.out.print(systemMsg + " > ");
        return scanner.nextInt();
    }

    public static boolean checkWinLine(char playerChar) {
        if (gamefield[0][0] == playerChar && gamefield[0][1] == playerChar && gamefield[0][2] == playerChar) return true;
        if (gamefield[1][0] == playerChar && gamefield[1][1] == playerChar && gamefield[1][2] == playerChar) return true;
        if (gamefield[2][0] == playerChar && gamefield[2][1] == playerChar && gamefield[2][2] == playerChar) return true;

        if (gamefield[0][0] == playerChar && gamefield[1][0] == playerChar && gamefield[2][0] == playerChar) return true;
        if (gamefield[0][1] == playerChar && gamefield[1][1] == playerChar && gamefield[2][1] == playerChar) return true;
        if (gamefield[0][2] == playerChar && gamefield[1][2] == playerChar && gamefield[2][2] == playerChar) return true;

        if (gamefield[0][0] == playerChar && gamefield[1][1] == playerChar && gamefield[2][2] == playerChar) return true;
        if (gamefield[0][2] == playerChar && gamefield[1][1] == playerChar && gamefield[2][0] == playerChar) return true;

        return false;
    }

    public static boolean checkFullField() {
        for (int y = 0; y < fieldH; y++) {
            for (int x = 0; x < fieldW; x++) {
                if (gamefield[y][x] == empty) {
                    return false;
                }
            }
        }
        return true;
    }
}
