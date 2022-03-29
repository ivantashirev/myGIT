package Jcore_HW5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Main {

    public static final String FILE_NAME = "Tashirev.csv";

    public static void main(String[] args) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
            byte[] csvData = newData().toString().getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(csvData);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static AppData newData() {
        AppData appData = new AppData();
        String[] headers = new String[] {"Who", "Where", "When"};
        appData.init(headers);
        return appData;
    }
}
