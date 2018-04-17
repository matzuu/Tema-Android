package com.example.bogdan.temaandroid;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Bogdan on 17-Apr-18.
 */
@Dao
public interface UserDAO {

    @Query("SELECT * FROM Users")
    List<User> getAllUsers();

    @Query("SELECT * FROM Users where first_name LIKE  :firstName AND last_name LIKE :lastName")
    User findByName(String firstName, String lastName);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);
}
