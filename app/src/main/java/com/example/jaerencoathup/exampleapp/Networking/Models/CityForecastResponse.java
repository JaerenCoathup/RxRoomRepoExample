package com.example.jaerencoathup.exampleapp.Networking.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by jaerencoathup on 05/05/2017.
 */

public class CityForecastResponse {

    @SerializedName("coord")
    public Coord coord;
    @SerializedName("base")
    public String base;
    @SerializedName("main")
    public Main main;
    @SerializedName("visibility")
    public int visibility;
    @SerializedName("wind")
    public Wind wind;
    @SerializedName("clouds")
    public Clouds clouds;
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

    public class Coord {
    }

    public class Main {
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

    public class Wind {
        @SerializedName("speed")
        public double speed;
        @SerializedName("deg")
        public int deg;
    }

    public class Clouds {
        @SerializedName("all")
        public int all;
    }

    public class Sys {
        @SerializedName("type")
        public int type;
        @SerializedName("id")
        public int id;
        @SerializedName("message")
        public double message;
        @SerializedName("country")
        public String country;
        @SerializedName("sunrise")
        public int sunrise;
        @SerializedName("sunset")
        public int sunset;
    }

    public class Weather {
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
