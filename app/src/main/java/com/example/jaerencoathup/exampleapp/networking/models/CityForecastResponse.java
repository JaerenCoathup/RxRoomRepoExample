package com.example.jaerencoathup.exampleapp.networking.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by jaerencoathup on 05/05/2017.
 */

public class CityForecastResponse {

    @SerializedName("coord")
    public Coord coord;
    @SerializedName("main")
    public Main main;
    @SerializedName("wind")
    public Wind wind;
    @SerializedName("dt")
    public int dt;
    @SerializedName("sys")
    public Sys sys;
    @SerializedName("id")
    public int id;
    @SerializedName("name")
    public String name;
    @SerializedName("cod")
    public int cod;
    @SerializedName("weather")
    public List<Weather> weather;

    public static class Coord {
        @SerializedName("lon")
        public double lon;
        @SerializedName("lat")
        public double lat;
    }

    public static class Main {
        @SerializedName("temp")
        public double temp;
        @SerializedName("pressure")
        public int pressure;
        @SerializedName("humidity")
        public int humidity;
        @SerializedName("temp_min")
        public double tempMin;
        @SerializedName("temp_max")
        public double tempMax;
    }

    public static class Wind {
        @SerializedName("speed")
        public double speed;
        @SerializedName("deg")
        public int deg;
    }

    public static class Clouds {
        @SerializedName("all")
        public int all;
    }

    public static class Sys {
        @SerializedName("country")
        public String country;
    }

    public static class Weather {
        @SerializedName("id")
        public int id;
        @SerializedName("main")
        public String main;
        @SerializedName("description")
        public String description;
        @SerializedName("icon")
        public String icon;
    }
}
