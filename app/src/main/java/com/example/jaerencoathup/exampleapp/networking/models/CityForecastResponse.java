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
    public double dt;
    @SerializedName("sys")
    public Sys sys;
    @SerializedName("id")
    public double id;
    @SerializedName("name")
    public String name;
    @SerializedName("cod")
    public float cod;
    @SerializedName("weather")
    public List<Weather> weather;

    public static class Coord {
        @SerializedName("lon")
        public float lon;
        @SerializedName("lat")
        public float lat;
    }

    public static class Main {
        @SerializedName("temp")
        public float temp;
        @SerializedName("pressure")
        public float pressure;
        @SerializedName("humidity")
        public float humidity;
        @SerializedName("temp_min")
        public float tempMin;
        @SerializedName("temp_max")
        public float tempMax;
    }

    public static class Wind {
        @SerializedName("speed")
        public float speed;
        @SerializedName("deg")
        public float deg;
    }

    public static class Clouds {
        @SerializedName("all")
        public float all;
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
