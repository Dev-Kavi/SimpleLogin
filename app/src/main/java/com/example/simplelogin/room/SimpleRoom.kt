package com.example.simplelogin.room

import androidx.room.Dao
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.simplelogin.room.table.UserDatabase

@Database(entities = [UserDatabase::class], version = 1, exportSchema = false)
abstract class SimpleRoom : RoomDatabase() {

    abstract val userDAO: UserDao
}

@Dao
interface UserDao {


}