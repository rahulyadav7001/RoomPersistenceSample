package com.ryandro.room_persistence_sample;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.util.Log;

import com.ryandro.room_persistence_sample.database.AppDataBase;
import com.ryandro.room_persistence_sample.entity.User;

import java.util.List;

public class DatabaseInitializer {
    private static final String TAG = DatabaseInitializer.class.getName();


    public static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {
        private final AppDataBase appDataBase;

        public PopulateDbAsync(AppDataBase appDataBase) {
            this.appDataBase = appDataBase;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            populateWithTestData(appDataBase);
            return null;
        }

        private static void populateWithTestData(AppDataBase appDataBase) {
            User user = new User();
            user.setFirstName("John");
            user.setLastName("Parker");
            user.setAge(43);

            addUser(appDataBase, user);
            List<User> userList = appDataBase.userDO().getAllUsers();
            Log.d(DatabaseInitializer.TAG, "Rows Count: " + userList.size());

        }

        private static User addUser(AppDataBase appDataBase, User user) {
            appDataBase.userDO().insertRecord(user);
            return user;
        }
        public static void populateSync(@NonNull final AppDataBase db) {
            populateWithTestData(db);
        }
        public static void populateAsync(@NonNull final AppDataBase db) {
            PopulateDbAsync task = new PopulateDbAsync(db);
            task.execute();
        }
    }
}
