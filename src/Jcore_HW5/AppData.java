package Jcore_HW5;

import java.util.Random;

public class AppData {
    private String[] header;
    private int[][] data;

    public void init(String[] header) {
        this.header = header;
        this.data = data;
        Random random = new Random();
        data = new int[header.length][header.length];

        for (int row = 0; row < header.length; row++) {
            for(int column = 0; column < header.length; column++) {
                data[row][column] = random.nextInt(10);
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (String word : header) {
            result += word + ";";
        }

        result += "\n";

        for (int row = 0; row < data.length; row++) {
            for (int column = 0; column < data[row].length; column++) {
                result += data[row][column] + ";";
            }
            result += "\n";
        }
        return result;
    }
}
