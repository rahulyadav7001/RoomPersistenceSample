package com.ryandro.room_persistence_sample.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.ryandro.room_persistence_sample.dao.UserDO;
import com.ryandro.room_persistence_sample.entity.User;

@Database(entities = {User.class},version = 1)
public abstract class AppDataBase extends RoomDatabase {
    private static AppDataBase appDataBase;

    public abstract UserDO userDO();

    public static AppDataBase getAppDataBase(Context context) {
        if (appDataBase == null) {
            appDataBase = Room.databaseBuilder(context, AppDataBase.class, "user-database").allowMainThreadQueries().build();
        }

        return appDataBase;
    }

    public void destroyDatabase() {
        appDataBase = null;
    }
}
