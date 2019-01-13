package com.example.jaerencoathup.exampleapp.persistence.typeconverters;

import androidx.room.TypeConverter;

import org.joda.time.DateTime;

/**
 * Created by jaerencoathup on 31/03/2018.
 */

public class RoomTypeConverters {

    @TypeConverter
    public DateTime convertLongToDateTime(long timestamp) {
        return new DateTime(timestamp);
    }

    @TypeConverter
    public long convertDateTimeToLong(DateTime dateTime) {
        return dateTime.getMillis();
    }
}
