package com.ryandro.room_persistence_sample.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.ryandro.room_persistence_sample.entity.User;

import java.util.List;

@Dao
public interface UserDO {

    @Query("Select * from tblUser")
    List<User> getAllUsers();

    @Insert
    void insertRecord(User... user);

    @Delete
    void delet(User user);
}
