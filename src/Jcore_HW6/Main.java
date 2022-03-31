package Jcore_HW6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    //Адрес запроса данных с севрвера
    private final static String WeatherURL = "http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212";
    //Токен для запроса
    private final static String API_KEY = "?apikey=CE8JATwXZq9mGQJnuTyaaawVHGOZHOOz";
    private final static String IS_METRIC = "&metric=true";

    public static void main(String[] args) {
        try {
            URL weatherUrl = new URL(WeatherURL+API_KEY+IS_METRIC); //склееный запрос для обращения к серверу
            HttpURLConnection urlConnection = (HttpURLConnection) weatherUrl.openConnection(); //Обращение к серверы
            //пуляем гет запрос к серверу
            if(urlConnection.getResponseCode()==200) {
                try(BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                    StringBuilder responseContent = new StringBuilder();
                    String line = "";
                    while ((line = reader.readLine()) != null) {
                        responseContent.append(line);
                    }
                    System.out.println(responseContent);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
