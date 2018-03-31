package com.example.jaerencoathup.exampleapp.persistence;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import com.example.jaerencoathup.exampleapp.networking.models.CityForecastResponse;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.util.List;

/**
 * Created by jaerencoathup on 25/03/2018.
 */
@Entity
public class ForecastEntity {

    @PrimaryKey
    public int id;
    public DateTime dt;
    public String country;
    public double temp;
    public int pressure;
    public int humidity;
    public double tempMin;
    public double tempMax;
    public String name;
    public int cod;
    @Embedded
    public ForecastEntity.Coord coord;
    @Embedded
    public ForecastEntity.Wind wind;
    @Embedded
    public ForecastEntity.Weather weather;

    public static ForecastEntity copyFromResponse(CityForecastResponse response) {
        ForecastEntity weatherEntity = new ForecastEntity();
        weatherEntity.name = response.name;
        weatherEntity.country = response.sys.country;
        weatherEntity.dt = DateTime.now();
        weatherEntity.temp = response.main.temp;
        weatherEntity.pressure = response.main.pressure;
        weatherEntity.humidity = response.main.humidity;
        weatherEntity.tempMin = response.main.tempMin;
        weatherEntity.tempMax = response.main.tempMax;
        weatherEntity.coord = new Coord(response.coord.lon, response.coord.lat);
        weatherEntity.wind = new Wind(response.wind.speed, response.wind.deg);
        CityForecastResponse.Weather recentWeather = response.weather.get(0);
        weatherEntity.weather = new Weather(recentWeather.main, recentWeather.description, recentWeather.icon);

        return weatherEntity;
    }

    @Entity
    public static class Coord {
        public double lon;
        public double lat;

        public Coord(double lon, double lat) {
            this.lon = lon;
            this.lat = lat;
        }
    }

    @Entity
    public static class Wind {
        public double speed;
        public int deg;

        public Wind(double speed, int deg) {
            this.speed = speed;
            this.deg = deg;
        }
    }

    @Entity
    public static class Weather {
        public String main;
        public String description;
        public String icon;

        public Weather(String main, String description, String icon) {
            this.main = main;
            this.description = description;
            this.icon = icon;
        }
    }

    public boolean isDataInDate() {
        return dt.plusMinutes(1).isAfter(DateTime.now());
    }
}
