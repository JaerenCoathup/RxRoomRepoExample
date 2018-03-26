package com.example.jaerencoathup.exampleapp.Persistence;

import com.example.jaerencoathup.exampleapp.Networking.Models.CityForecastResponse;
import java.util.List;

/**
 * Created by jaerencoathup on 25/03/2018.
 */

public class WeatherData {

    public CityForecastResponse.Coord coord;
    public CityForecastResponse.Main main;
    public CityForecastResponse.Wind wind;
    public int dt;
    public CityForecastResponse.Sys sys;
    public int id;
    public String name;
    public int cod;
    public List<CityForecastResponse.Weather> weather;

    public static WeatherData copyFromResponse(CityForecastResponse response) {
        return new WeatherData();
    }

    public static class Coord {
        public double lon;
        public double lat;
    }

    public static class Main {
        public double temp;
        public int pressure;
        public int humidity;
        public double tempMin;
        public double tempMax;
    }

    public static class Wind {
        public double speed;
        public int deg;
    }

    public static class Clouds {
        public int all;
    }

    public static class Sys {
        public String country;
    }

    public static class Weather {
        public int id;
        public String main;
        public String description;
        public String icon;
    }
}
